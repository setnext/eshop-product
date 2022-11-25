FROM openjdk:17-jdk-slim-buster

COPY ./target/com.setnext.eshop.products.jar /opt/app/

ARG JAR_FILE=com.setnext.eshop.products.jar

WORKDIR /opt/app

ENTRYPOINT ["java","-jar","com.setnext.eshop.products.jar"]
