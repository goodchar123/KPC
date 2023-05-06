import re
import json
from typing import Any, Union, Tuple, List

def search_KG(fqn: str, kg: [dict]) -> [dict]:
    """
    Search through Knowledge Graph by matching FQN and return its exceptions to be handled
    :param fqn: the fully qualified name of our target API
    :param kg: knowledge graph
    :return: a list of exceptions that the target API needs to handle, None if unable to find target API
    """
    exception_list = []
    for api_dict in kg:
        API_name = api_dict["API_name"]
        if fqn == API_name:
            knowledge_list = api_dict["Knowledge"]
            for knowledge in knowledge_list:
                exception_dict = {"throw_exception": knowledge["throw_exception"],
                                  "throw_condition": knowledge["throw_condition"]}
                exception_list.append(exception_dict)
            return exception_list
    return exception_list

def get_FQNs(text: str) -> [str]:
    """
    Obtain a list of Fully Qualified Names from the response by checker
    :param text: checker-gpt's response
    :return: a list of FQNs
    """
    split_text = text.split("\n")
    fqn_list = []
    for fqn in split_text:
        m = re.search("`(.+?)`", fqn)
        if m:
            found = m.group(1)
            found = found.replace(" ", "")
            fqn_list.append(found)

    return fqn_list

# log each question/prompt with its response into a log file
def log_QnA(file: str, prompt: str, response: str):
    with open(file, "a+") as f:
        f.write(f"{prompt}\n")
        f.write(f"{response}\n")
        f.write("------------------------------------------------------\n")

def record_completed_task_id(file: str, task_id: str):
    with open(file, "a+") as f:
        f.write(task_id + "\n")

def get_completed_task_id(file: str) -> [str]:
    with open(file, "r") as file:
        lines = file.readlines()
    # Remove newline characters at the end of each line, if needed
    completed_task_id = [line.strip() for line in lines]
    return completed_task_id

# read previous generated response from log txt
# response is appropriately cleaned and preprocessed, ready to manually add into GPT's conversation
def read_previous_response_from_txt(filename: str) -> str:
    with open(filename, "r") as file:
        previous_response = file.readlines()[3:]
        previous_response = " ".join(str(x) for x in previous_response)
        previous_response = previous_response.replace("------------------------------------------------------\n", "")
    return previous_response

def read_KG(kg_json: str) -> [dict]:
    """
    Read the json file containing Knowledge Graph
    :param kg_json: json file
    :return: a list of dictionary of API knowledge
    """
    with open(kg_json, "r") as j:
        kg = json.loads(j.read())
    return kg

def combine_all_exceptions_to_add_in_one_big_prompt(excpt_to_add_list: [str]) -> str:
    """
    Aggregate all individual exceptions checking/adding prompt into one single large prompt
    :param excpt_to_add_list: list containing the exceptions to handle
    :return: a large string that contains all the exceptions prompt
    """
    all_exceptions_to_add_in_one_prompt = ""
    for excpt_to_add in excpt_to_add_list:
        all_exceptions_to_add_in_one_prompt = all_exceptions_to_add_in_one_prompt + excpt_to_add + "\n"
    all_exceptions_to_add_in_one_prompt = all_exceptions_to_add_in_one_prompt.rstrip()
    return all_exceptions_to_add_in_one_prompt

def log_stats(file: str, unhandled_api_list: [str], unhandled_exception_list: [str], loop_count: int):
    stat_dict = {"loop_id": loop_count, "unhandled_api_list": unhandled_api_list, "num_of_unhandled_api": len(unhandled_api_list), "unhandled_exception_list": unhandled_exception_list, "num_of_unhandled_exception": len(unhandled_exception_list)}
    # Open a file in write mode
    with open(file, "a+") as outfile:
        # Write the dictionary object to the file in JSON format
        json.dump(stat_dict, outfile)
        outfile.write("\n")

def log_task_with_no_code_or_exceptions(file: str, task_id: str, type: str):
    d = {"id": task_id, "no_code": False, "no_api_to_check": False}
    if type == "code":
        d["no_code"] = True
    elif type == "api":
        d["no_api_to_check"] = True

    with open(file, "a+") as outfile:
        json.dump(d, outfile)
        outfile.write("\n")

def log_task_considered(file: str, task_id: str):
    with open(file, "a+") as outfile:
        outfile.write(task_id + "\n")

def read_tasks_from_txt(filename: str) -> [str]:
    with open(filename) as file:
        tasks = [line.rstrip() for line in file]
    return tasks

def get_task(task: str) -> tuple[Union[str, Any], Union[str, Any], Union[str, Any]]:
    task_information = re.split(r'\t+', task)
    id = task_information[0]
    task = task_information[1]
    method = task_information[2]

    return id, task, method

def record_error_task_id(file: str, task_id: str):
    with open(file, "a+") as f:
        f.write(task_id + "\n")

