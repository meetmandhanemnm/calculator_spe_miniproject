FROM openjdk:11
WORKDIR /
COPY ./target/calculator_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar calculator_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar
CMD ["java","-jar","calculator_miniproject-1.0-SNAPSHOT-jar-with-dependencies.jar"]