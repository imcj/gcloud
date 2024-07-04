FROM gradle:jdk22 AS build
WORKDIR /app
COPY . .
RUN gradle build

FROM openjdk:22-jdk-slim
WORKDIR /app
COPY --from=build /app/build/libs/*.jar ./gcloud.jar
CMD ["java", "-jar", "gcloud.jar"]
