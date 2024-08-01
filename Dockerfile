FROM openjdk:18
WORKDIR /app
COPY ./target/MatrimonialServiceJenkinsIntegration-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "MatrimonialServiceJenkinsIntegration-0.0.1-SNAPSHOT.jar"]
