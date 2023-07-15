FROM openjdk:17-jdk-slim-buster

ARG JAR_FILE=com.setnext.eshop.products.jar

ENV JAR_FILE_NAME=${JAR_FILE}

COPY ./target/${JAR_FILE} /opt/app/

WORKDIR /opt/app

ENTRYPOINT ["java","-jar","-Djdk.tls.client.protocols=TLSv1.2","com.setnext.eshop.products.jar"]
