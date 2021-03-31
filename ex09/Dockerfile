FROM python:alpine

# docker build --build-arg PORT=7500 .
ARG PORT=6500

RUN apk add gcc musl-dev linux-headers

WORKDIR /app

# docker run -e FLASK_RUN_PORT=8500 ....
ENV FLASK_APP=app.py FLASK_RUN_HOST=0.0.0.0 FLASK_RUN_PORT=${PORT}

EXPOSE ${PORT}

COPY ./requirements.txt .

RUN pip install -r ./requirements.txt

COPY ./app.py .

ENTRYPOINT [ "flask", "run" ]