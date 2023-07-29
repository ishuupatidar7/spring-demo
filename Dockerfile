FROM openjdk:19
EXPOSE 8080
COPY target/spring-demo-cicd.jar spring-demo-cicd.jar
ENTRYPOINT ["java","-jar","spring-demo-cicd.jar"]
