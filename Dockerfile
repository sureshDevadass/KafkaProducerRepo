From openjdk:17
COPY target/Producer Producer.jar
CMD [ "java","-jar","Producer.jar" ]