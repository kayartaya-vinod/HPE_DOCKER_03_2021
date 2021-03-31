FROM node:alpine

WORKDIR /app

ENV PORT=5000

EXPOSE 5000

ENTRYPOINT [ "node" ]

CMD [ "./server.js" ]

COPY ./package.json .

RUN npm install

COPY ./server.js .
