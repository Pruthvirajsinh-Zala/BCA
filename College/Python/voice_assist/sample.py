# -*- coding: utf-8 -*-
"""
Created on Wed Jan 22 14:32:30 2025

@author: PruthvirajsinhZala
"""

import tkinter as tk
from tkinter import scrolledtext
import google.generativeai as genai

# Configure Gemini API
genai.configure(api_key="AIzaSyAqHyomjGTT3Ik8d5anx1txFkzpOSCJLPI")

def get_gemini_response(prompt):
    """Fetch a response from Gemini API."""
    model = genai.GenerativeModel("gemini-1.5-flash")
    response = model.generate_content(prompt)
    return response.text

def send_message():
    """Handle sending a message."""
    user_message = user_input.get()
    if user_message.strip() == "":
        return

    # Display user's message
    chat_window.config(state=tk.NORMAL)
    chat_window.insert(tk.END, f"You: {user_message}\n", "user")
    user_input.delete(0, tk.END)

    # Get and display assistant's response
    assistant_response = get_gemini_response(user_message)
    chat_window.insert(tk.END, f"Assistant: {assistant_response}\n", "assistant")
    chat_window.config(state=tk.DISABLED)
    chat_window.yview(tk.END)

# Create the main window
root = tk.Tk()
root.title("Cool Chat Assistant")
root.geometry("500x600")
root.configure(bg="#1f1f1f")

# Style configurations
FONT_USER = ("Arial", 12, "bold")
FONT_ASSISTANT = ("Arial", 12)
BG_COLOR = "#1f1f1f"
FG_USER = "#00ff00"
FG_ASSISTANT = "#ffffff"
BUTTON_BG = "#2e2e2e"
BUTTON_FG = "#ffffff"
ENTRY_BG = "#2e2e2e"
ENTRY_FG = "#ffffff"

# Chat display area
chat_window = scrolledtext.ScrolledText(root, wrap=tk.WORD, width=60, height=25, bg=BG_COLOR, fg=FG_ASSISTANT, font=FONT_ASSISTANT)
chat_window.grid(column=0, row=0, padx=10, pady=10, columnspan=2)
chat_window.tag_config("user", foreground=FG_USER, font=FONT_USER)
chat_window.tag_config("assistant", foreground=FG_ASSISTANT, font=FONT_ASSISTANT)
chat_window.config(state=tk.DISABLED)

# Input field
user_input = tk.Entry(root, width=40, bg=ENTRY_BG, fg=ENTRY_FG, font=FONT_ASSISTANT, insertbackground=FG_ASSISTANT)
user_input.grid(column=0, row=1, padx=10, pady=10, sticky="ew")

# Send button
send_button = tk.Button(root, text="Send", command=send_message, bg=BUTTON_BG, fg=BUTTON_FG, font=("Arial", 12))
send_button.grid(column=1, row=1, padx=10, pady=10)

# Start the GUI event loop
root.mainloop()

