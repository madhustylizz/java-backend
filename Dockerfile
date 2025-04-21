# Use OpenJDK 17 image
FROM openjdk:17-jdk-slim

# Set working directory in the container
WORKDIR /app

# Copy the backend JAR file into the container
COPY target/java-backend.jar /app/java-backend.jar

# Copy the Angular build files to a static directory in the container
COPY angular-frontend/dist /app/angular-frontend/dist

# Expose port 8080 (same port for both backend and frontend)
EXPOSE 8082

# Run the Java application (backend)
CMD ["java", "-jar", "java-backend.jar"]
