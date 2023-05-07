FROM openjdk:17
EXPOSE 8081
ADD target/testrepo.jar testrepo.jar
ENTRYPOINT ["java", "-jar", "/testrepo.jar"]
