# Use OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the backend JAR file into the container
COPY target/java-backend.jar /app/java-backend.jar

# Expose port 8082 (backend service)
EXPOSE 8082

# Run the Java application (backend)
CMD ["java", "-jar", "java-backend.jar"]
