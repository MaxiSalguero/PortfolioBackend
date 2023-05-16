 FROM amazoncorretto:17-alpine-jdk
 MAINTAINER MSS 
 COPY target/SpringBoot-0.0.1-SNAPSHOT.jar mss-app.jar
 ENTRYPOINT ["java", "-jar", "/mss-app.jar"]