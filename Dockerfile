From openjdk:17
COPY target/Producer.jar Producer.jar
CMD [ "java","-jar","Producer.jar" ]