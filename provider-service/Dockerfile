FROM java:8

RUN mkdir /app
WORKDIR /app
COPY target/provider-service-0.0.1-SNAPSHOT.jar /app/provider-service.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/provider-service.jar", "--spring.profiles.active=docker"]
EXPOSE 8010