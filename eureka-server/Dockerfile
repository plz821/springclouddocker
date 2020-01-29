FROM openjdk:8-jre-alpine

RUN mkdir /app
WORKDIR /app
COPY target/eureka-server-0.0.1-SNAPSHOT.jar /app/eureka-server.jar
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-XX:+UseCGroupMemoryLimitForHeap", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/eureka-server.jar", "--spring.profiles.active=docker"]
EXPOSE 8000