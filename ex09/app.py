from flask import Flask

app = Flask(__name__)

@app.route("/")
def main():
    return "<h1>Hello from Flask App!</h1><hr><p>By Vinod</p>"

