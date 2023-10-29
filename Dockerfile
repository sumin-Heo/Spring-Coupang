FROM openjdk:17-jdk-slim-buster
LABEL authors="someone"

COPY . /docker-tutorial
WORKDIR /docker-tutorial
ENV SPRING_PROFILE local

CMD ["./gradlew", "bootRun", "--args='--spring.profiles.active=${SPRING_PROFILE}'"]
