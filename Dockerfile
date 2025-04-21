FROM openjdk:17-jdk-slim
WORKDIR /app
COPY . /app
RUN ./mvnw package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/*.jar"]
