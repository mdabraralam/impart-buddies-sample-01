# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /impart-bodies-sample-service

# Copy the JAR file from the target directory
COPY target/impart-bodies-sample-service-0.0.1-SNAPSHOT.jar impart-bodies-sample-service.jar

# Expose port 8761 for Eureka - What is the maximum number of builds that can run for a job in the case of continuous failure?
EXPOSE 8761

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "impart-bodies-sample-service.jar"]