FROM java:8-jdk-alpine
COPY ./target/eks-poc-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
RUN sh -c 'touch app.jar'
ENTRYPOINT ["java","-jar","app.jar"]
