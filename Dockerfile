FROM eclipse-temurin:11-jdk-alpine

WORKDIR /app

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar app.jar $JAVA_ARGS"]