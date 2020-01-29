FROM openjdk:8-jre-alpine

RUN mkdir /app
WORKDIR /app
COPY target/provider-service-0.0.1-SNAPSHOT.jar /app/provider-service.jar
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/provider-service.jar", "--spring.profiles.active=docker"]
EXPOSE 8010