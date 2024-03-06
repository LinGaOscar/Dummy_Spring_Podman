#pulling jre image
FROM docker.io/library/openjdk:17-oracle
#set working dir
WORKDIR /app
COPY demo-0.0.1-SNAPSHOT.jar app.jar
# Expose the port that your Spring Boot application listens on (default is 8080)
EXPOSE 8080
# Define the command to run your application
CMD ["java","-Dserver.port=8080","-jar","app.jar"]