#Start with base image with java 17
FROM eclipse-temurin:17-ubi9-minimal

#Infomation around who maintains the image
MAINTAINER sujay

#Add the application's jar to the image. Syntax: COPY <source> <destination>
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts.jar

#below command will run the jar file (java -jar accounts.jar) when the container starts
ENTRYPOINT ["java","-jar","accounts.jar"]