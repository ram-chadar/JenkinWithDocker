FROM openjdk:8
COPY target/Product_RestAPI_DockerCompose.jar product_restapi_dockercompose
ENTRYPOINT ["java","-jar","Product_RestAPI_DockerCompose.jar"]
