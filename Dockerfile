FROM openjdk:11
ADD target/docker-demo.jar docker-demo.jar
ENTRYPOINT ["java", "-jar","docker-demo.jar"]
EXPOSE 8090