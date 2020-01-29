FROM openjdk:8-jre-alpine

RUN mkdir /app
WORKDIR /app
COPY target/consumer-service-0.0.1-SNAPSHOT.jar /app/consumer-service.jar
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/consumer-service.jar", "--spring.profiles.active=docker"]
EXPOSE 9010