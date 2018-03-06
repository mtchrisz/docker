FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 5005
ADD target/gs-spring-boot-0.1.0.jar target/app.jar
ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005", "-jar","-Dspring.profiles.active=local","target/app.jar"]