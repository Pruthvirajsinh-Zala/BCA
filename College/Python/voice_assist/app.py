from flask import Flask, request, jsonify
import requests

app = Flask(__name__)

# Replace with your Gemini API key
GEMINI_API_KEY = "AIzaSyAqHyomjGTT3Ik8d5anx1txFkzpOSCJLPI"
GEMINI_API_URL = "https://gemini.api.endpoint"

def call_gemini_api(user_input):
    """Send user input to the Gemini API and return the response."""
    headers = {
        "Authorization": f"Bearer {GEMINI_API_KEY}",
        "Content-Type": "application/json",
    }
    data = {
        "prompt": user_input,
        "max_tokens": 150,
    }
    response = requests.post(GEMINI_API_URL, headers=headers, json=data)
    if response.status_code == 200:
        return response.json().get("choices", [{}])[0].get("text", "No response")
    else:
        return "Error communicating with Gemini API."

@app.route("/chat", methods=["POST"])
def chat():
    """Handle chat requests from the frontend."""
    user_input = request.json.get("message", "")
    if not user_input:
        return jsonify({"error": "Message is required"}), 400
    response = call_gemini_api(user_input)
    return jsonify({"response": response})

if __name__ == "__main__":
    app.run(debug=True)
