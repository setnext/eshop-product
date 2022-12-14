FROM openjdk:17-jdk-slim-buster

ARG JAR_FILE=com.setnext.eshop.products.jar

ENV JAR_FILE_NAME=${JAR_FILE}

COPY ./target/${JAR_FILE} /opt/app/

WORKDIR /opt/app

RUN ls

ENTRYPOINT ["java","-jar","com.setnext.eshop.products.jar"]
