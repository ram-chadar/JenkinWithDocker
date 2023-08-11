FROM openjdk:8
COPY target/Product_RestAPI_DockerCompose.jar Product_RestAPI_DockerCompose.jar
ENTRYPOINT ["java","-jar","Product_RestAPI_DockerCompose.jar"]