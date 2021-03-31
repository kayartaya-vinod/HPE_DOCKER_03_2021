FROM node:alpine

WORKDIR /myapp

COPY ./package.json .

# install dependencies listed in package.json
# RUN npm config set proxy 123.33.4.6

RUN npm install 

COPY . .

ENTRYPOINT [ "node", "./server.js" ]
