FROM openjdk:17
COPY target/ev-charging-station-api-0.0.1.jar ev-charging-station-api-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/ev-charging-station-api-0.0.1.jar"]