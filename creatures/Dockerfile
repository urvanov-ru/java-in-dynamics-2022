FROM openjdk:17-alpine
RUN addgroup -S creatures && adduser -S creatures -G creatures
USER creatures:creatures
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]