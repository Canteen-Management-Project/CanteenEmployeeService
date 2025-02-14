FROM openjdk:17-jdk-slim
#WORKDIR /app
COPY target/canteen-employee-service-0.0.1-SNAPSHOT.jar canteen-employee-service.jar
EXPOSE 9094
ENTRYPOINT [ "java","-jar","canteen-employee-service.jar" ] 