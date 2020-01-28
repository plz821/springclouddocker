FROM java:8

RUN mkdir /app
WORKDIR /app
COPY target/consumer-service-0.0.1-SNAPSHOT.jar /app/consumer-service.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/consumer-service.jar", "--spring.profiles.active=docker"]
EXPOSE 9010