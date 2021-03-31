#! /bin/sh
docker rm -f flaskapp
docker run -d -p 8500:8500 \
    --name flaskapp \
    learnwithvinod/flaskapp

