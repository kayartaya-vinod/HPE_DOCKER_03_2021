FROM alpine:3

# creates the specified directory path if not already present, and 
# switches to that as PWD
WORKDIR /vinod/files

# equivalent of docker cp vinod.txt <container-id>:/vinod/files
ADD . .

ENTRYPOINT [ "cat", "/vinod/files/vinod.txt" ]