import openai
import os
import time
import sys
from contextlib import contextmanager

from Java_Tasks import chatGPT
from Java_Tasks.Util import *

def generate_code_with_KG(id: str, task: str, KG: [dict], log_dir: str, sleep_time: int = 2):
    print(f"Looking at Task {id}..")

    main_gpt = chatGPT.ChatGPT()
    checker_gpt = chatGPT.ChatGPT()

    # log file configuration
    log_folder = log_dir + f"/task_{id}"
    if not os.path.exists(log_folder):
        os.makedirs(log_folder)

    main_log_dir = log_folder + f"/task_{id}_main.txt"
    checker_log_dir = log_folder + f"/task_{id}_checker.txt"
    final_log_dir = log_folder + f"/task_{id}_final.txt"
    stats_log_dir = log_folder + f"/task_{id}_stats.txt"

    # ask task first, use main gpt
    print(f"Waiting for gpt to response for \"{task}\"")
    response = main_gpt.ask_gpt(task)
    log_QnA(main_log_dir, task, response) # log to corresponding file - main
    print("Responded. Logging conversation.")
    time.sleep(sleep_time)  # 为了避免OpenAI API调用过于频繁而被限制，建议加入一个时间间隔

    # code generated by main gpt
    code_generated = response

    code_snippet_generated = True
    unhandled_api_occurred = True

    loop_count = 0

    while True:
        # add the code generated by Main-GPT to checker gpt
        checker_gpt.manual_add_response(code_generated)

        # ask checker to check if there is code generated in the first attempt
        if loop_count == 0:
            print("Waiting for Checker-GPT to check if there was code generated..")
            if_code_generated_prompt = "Check whether the response includes a code snippet. A code snippet is quoted with ```java. Answer in Yes or No only. No other text."
            response = checker_gpt.ask_checker(code_generated, if_code_generated_prompt)

            # if no code was generated in the first round, we record it and exit loop
            if response.lower().startswith("no"):
                code_snippet_generated = False
                log_task_with_no_code_or_exceptions(log_dir + "/tasks_ignored.txt", id, "code")
                break
            else:
                print("First response contains code snippet. All is good, proceed to next step.")

        # ask checker to list FQNs
        print("Waiting for Checker-GPT to response for FQNs..")
        FQN_prompt = "List the fully qualified name of the Java JDK methods used in the method above. Provide only name with parameters, no other text. Parameters must be fully qualified. Display in a list."
        response = checker_gpt.ask_checker(code_generated, FQN_prompt)
        fqn_list = get_FQNs(response)
        log_QnA(checker_log_dir, FQN_prompt, f"{response}\n\n + From response, we get: {fqn_list}")
        print("Responded. Logging conversation.")
        time.sleep(sleep_time)  # 为了避免OpenAI API调用过于频繁而被限制，建议加入一个时间间隔

        excpt_to_add_list = []
        unhandled_api_list = []

        for fqn in fqn_list:
            list_exception_dict = search_KG(fqn, KG)

            if list_exception_dict:
                for exception_dict in list_exception_dict:
                    exception_to_handle = exception_dict["throw_exception"]
                    condition = exception_dict["throw_condition"]

                    # feed these to checker again
                    # Is the [Exception] handled for [API] in the code snippet? (Y/N)
                    print(f"Waiting for Checker-GPT to response for \"If {exception_to_handle} is handled for {fqn}\"..")
                    exception_exist_prompt = f"Is the {exception_to_handle} handled or caught for {fqn} in the code snippet? Answer in Yes or No only."
                    response = checker_gpt.ask_checker(main_gpt_response=None, prompt=exception_exist_prompt)
                    log_QnA(checker_log_dir, exception_exist_prompt, response)
                    print("Responded. Logging conversation.")
                    time.sleep(sleep_time)  # 为了避免OpenAI API调用过于频繁而被限制，建议加入一个时间间隔

                    # if no then record the exception, saving for later to use
                    if response.lower().startswith("no."):
                        exception_to_check_prompt = f"Please check {condition} for {fqn} in the code snippet you provided, otherwise throw {exception_to_handle}."
                        excpt_to_add_list.append(exception_to_check_prompt)
                        unhandled_api_list.append(fqn)

        # if no APIs had unhandled exception in the first round, record it and exit loop
        if loop_count == 0 and not excpt_to_add_list:
            unhandled_api_occurred = False
            log_task_with_no_code_or_exceptions(log_dir + "/tasks_ignored.txt", id, "api")
            break

        # record intermediate results
        log_stats(file=stats_log_dir, unhandled_api_list=unhandled_api_list, unhandled_exception_list=excpt_to_add_list, loop_count=loop_count)

        if len(excpt_to_add_list) > 0:
            print(f"Number of Unhandled Exceptions: {len(excpt_to_add_list)}")
        else:
            print(f"Number of Unhandled Exceptions: {len(excpt_to_add_list)}. Loop expects to terminate..")
        # checking termination condition, if list is empty; that means no exceptions need to add. Stop the checking loop
        if not excpt_to_add_list:
            print("Loop is terminated. OK")
            break

        # TODO: combine all exception into one big prompt
        all_exceptions_to_add_in_one_prompt = combine_all_exceptions_to_add_in_one_big_prompt(excpt_to_add_list)
        print(f"Exceptions in one prompt is\n{all_exceptions_to_add_in_one_prompt}\n")

        # TODO: feed exceptions to handle back to main gpt
        print(f"Waiting for Main-GPT to response for adding required exceptions..")
        response = main_gpt.ask_gpt(all_exceptions_to_add_in_one_prompt)
        log_QnA(main_log_dir, all_exceptions_to_add_in_one_prompt, response)
        print("Responded. Logging conversation.")
        time.sleep(sleep_time)  # 为了避免OpenAI API调用过于频繁而被限制，建议加入一个时间间隔

        code_generated = response
        checker_gpt.clear_context_conversion()
        loop_count += 1

    if code_snippet_generated and unhandled_api_occurred:
        log_QnA(final_log_dir, "", code_generated)
        log_task_considered(log_dir + "/tasks_considered.txt", id)
        print(f"Logged final code result.")
    else:
        print(f"No code snippet generated or no unhandled APIs in the first generation.")

    record_completed_task_id(os.getcwd() + "/tasks_completed.txt", id)
    print(f"Task {id} completed!\n")
    return

def main():
    # OPENAI API key configuration
    openai.api_key = ""

    # set current working directory
    cwd = os.getcwd()

    # set output directory
    log_dir = cwd + "/java_tasks_log"
    if not os.path.exists(log_dir):
        os.makedirs(log_dir)

    # set the name of the file to which the console output will be written
    output_file_name = os.getcwd() + "/console_output.txt"

    # txt file containing all the tasks
    java_task_txt = cwd + "/tasks_javadoc_one_third.txt"

    tasks_list = read_tasks_from_txt(java_task_txt)

    # get the previously completed task ids, so that we can skip them
    if os.path.exists(os.getcwd() + "/tasks_completed.txt"):
        completed_task_id_list = get_completed_task_id(os.getcwd() + "/tasks_completed.txt")
    else:
        completed_task_id_list = []

    KG = read_KG(os.getcwd() + "/kg_all_type.json")

    # open the file in write mode and redirect the standard output stream to it
    with open(output_file_name, "a+") as output_file, redirect_stdout_tee(output_file, sys.stdout):

        for task in tasks_list:
            id, task, api = get_task(task)

            if id in completed_task_id_list:
                continue

            try:
                generate_code_with_KG(id=id, task=task, KG=KG, log_dir=log_dir)
            except openai.error.InvalidRequestError or openai.error.RateLimitError or openai.error.Timeout or openai.error.APIError :
                print(f"Task {id} encountered error. Log to error.log\n")
                record_error_task_id(os.getcwd() + "/error_tasks.txt", id)
@contextmanager
def redirect_stdout_tee(file1, file2):
    """
    Redirects standard output to two file objects simultaneously.
    """
    class Tee(object):
        def __init__(self, file1, file2):
            self.file1 = file1
            self.file2 = file2

        def write(self, data):
            self.file1.write(data)
            self.file2.write(data)

        def flush(self):
            self.file1.flush()
            self.file2.flush()

    original_stdout = sys.stdout
    sys.stdout = Tee(file1, file2)
    try:
        yield
    finally:
        sys.stdout = original_stdout

if __name__ == "__main__":
    main()




