FROM openjdk:11-jdk
COPY ./target/SPEScientificCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "SPEScientificCalculator-1.0-SNAPSHOT.jar","org/example/SPEScientificCalculator"]