FROM openjdk:8-jdk-alpine
MAINTAINER vpnkmr764@gmail.com
COPY target/nagp-0.0.1-SNAPSHOT.jar nagp-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/nagp-0.0.1-SNAPSHOT.jar"]