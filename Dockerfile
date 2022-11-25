# FROM maven:3.8.1-openjdk-17 AS maven
# LABEL MAINTAINER="nithya@setnext.io"

# WORKDIR /usr/src/app
# COPY . /usr/src/app
# # Compile and package the application to an executable JAR
# RUN mvn package 

# For Java 17,Slim Java Version 
FROM openjdk:17-jdk-slim-buster

ARG JAR_FILE=com.setnext.eshop.products.jar
ARG workspace

WORKDIR /opt/app

RUN echo $(ls -1 $workspace)

RUN echo "workspace passed is $workspace"

# Copy the com.setnext.eshop.products.jar.
COPY ${workspace}/target/${JAR_FILE} /opt/app/

ENTRYPOINT ["java","-jar","com.setnext.eshop.products.jar"]
