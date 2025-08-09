FROM gradle:8.9-jdk21 AS build
WORKDIR /home/gradle/app
COPY --chown=gradle:gradle . .
RUN gradle bootJar --no-daemon

# Рантайм
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /home/gradle/app/build/libs/*.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app/app.jar"]
