FROM openjdk:11

WORKDIR /app

# COPY ./HelloWorld.class .
ADD https://vinod.co/resources/hpe-docker/HelloWorld.class .

# startup command
ENTRYPOINT [ "java", "HelloWorld" ]

# 1. values given in CMD are parameters for the ENTRYPOINT command (executable)
# 2. This is replaceable at the runtime (when container is created/run)
# 3. In the absense of ENTRYPOINT, CMD itself acts as an executable
CMD ["VINOD"]