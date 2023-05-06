import os
import openai

class ChatGPT:

    def __init__(self):
        # Typically, a conversation is formatted with a system message first,
        # followed by alternating user and assistant messages.
        self.conversation = [{"role": "system", "content": "You are a helpful assistant."}]

    def ask_gpt(self, user_input: str) -> str:
        """
        model used is gpt-3.5-turbo
        temperature is set to be 0.0, which is most deterministic and least random
        max_token is default, which is (4096 - prompt tokens)

        Parameter
        ----------
        question : str
            The question to be asked to chatgpt
        """

        self.conversation.append({"role": "user", "content": user_input})

        response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo",
            messages=self.conversation,
            temperature=0.0
        )

        answer = response["choices"][0]["message"]["content"]

        self.conversation.append({"role": "assistant", "content": answer})

        return answer

    def ask_checker(self, main_gpt_response: str, prompt: str) -> str:
        """
        model used is gpt-3.5-turbo
        temperature is set to be 0.0, which is most deterministic and least random
        max_token is default, which is (4096 - prompt tokens)

        Parameter
        ----------
        question : str
            The question to be asked to chatgpt
        """
        if main_gpt_response is not None:
            checker_input = main_gpt_response + "\n" + prompt

        else:
            checker_input = prompt

        self.conversation.append({"role": "user", "content": checker_input})

        response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo",
            messages=self.conversation,
            temperature=0.0
        )

        answer = response["choices"][0]["message"]["content"]

        self.conversation.append({"role": "assistant", "content": answer})

        return answer

    # this method is used to add previously generated answer/response to gpt
    def manual_add_response(self, response: str):
        self.conversation.append({"role": "assistant", "content": response})

    # this method is used to clear previous conversation.
    # This is to prevent looping too many times which could cause MaxTokenExceed Error from openai
    def clear_context_conversion(self):
        self.conversation = [{"role": "system", "content": "You are a helpful assistant."}]

    def __str__(self):
        output = ""
        for conversation in self.conversation:
            output += str(conversation) + "\n"
        output = output.rstrip('\n')
        return output
