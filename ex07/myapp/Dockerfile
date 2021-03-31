FROM node:alpine as STAGE1

WORKDIR /app

COPY ./package.json .

# install dependencies listed in package.json
RUN npm i

COPY . .

# inside the container create a production build of your react app
# this creates a folder called "build" and puts all the generated artifacts into that
RUN npm run build

FROM nginx:alpine as STAGE2

COPY --from=STAGE1 /app/build /usr/share/nginx/html

EXPOSE 80

ENTRYPOINT [ "nginx", "-g", "daemon off;"]
