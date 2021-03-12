FROM openjdk:8
COPY ./target/calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-cp" , "calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]
