FROM openjdk:8
EXPOSE 8080
ADD target/HW-service.jar HW-service.jar 
ENTRYPOINT ["java","-jar","/HW-service.jar"]
