import speech_recognition as sr
import pyttsx3
import google.generativeai as genai

# Configure the Gemini API with your API key
genai.configure(api_key="AIzaSyAqHyomjGTT3Ik8d5anx1txFkzpOSCJLPI")

# Initialize the text-to-speech engine
tts_engine = pyttsx3.init()

def speak(text):
    """Convert text to speech."""
    tts_engine.say(text)
    tts_engine.runAndWait()

def listen():
    """Capture audio input and convert it to text."""
    recognizer = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        audio = recognizer.listen(source)
        try:
            return recognizer.recognize_google(audio)
        except sr.UnknownValueError:
            return "I'm sorry, I didn't catch that."
        except sr.RequestError:
            return "I'm sorry, there was an issue with the speech recognition service."

def get_gemini_response(prompt):
    """Generate a response using the Gemini API."""
    model = genai.GenerativeModel("gemini-1.5-flash")
    response = model.generate_content(prompt)
    return response.text

def main():
    print("Voice assistant is active. Say 'exit' to quit.")
    speak("How can I assist you today?")
    while True:
        user_input = listen()
        if user_input.lower() in ["exit", "quit"]:
            speak("Goodbye!")
            break
        print(f"You said: {user_input}")
        response = get_gemini_response(user_input)
        print(f"Assistant: {response}")
        speak(response)

if __name__ == "__main__":
    main()
