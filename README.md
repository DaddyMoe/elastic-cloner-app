# Elastic Cloner App

## Run and Build


### To Build and Run the application, execute: If you are using Maven, EXECUTE
    $ mvn package && java -jar target/cloneProperties-0.0.1-SNAPSHOT.jar

### Check out the service. 
    $ curl localhost:8080

### Build Application - Maven
    $ mvn package

### To Run the application - Maven
    
    $ java -jar target/cloneProperties-0.0.1-SNAPSHOT.jar
    $ java -jar target/cloneProperties-0.0.1-SNAPSHOT.war (if building to ship to dedicated Servlet container)
    

## Stack

  - Spring Boot
  - spring-boot-starter-web
  - spring-boot-starter-thymeleaf
  - spring-boot-starter-actuator
  - spring-boot-starter-jdbc
  - Embedded - h2database

## Generated Base:
    Using https://start.spring.io/

## GETTING STARTED
Building an Application with Spring Boot: https://spring.io/guides/gs/spring-boot/


## Plus

### Add production-grade services
Added some management services. Spring Boot provides several out of the box with its actuator module,
such as health, audits, beans, and more.

NOTE:
There is also a /shutdown endpoint, but it’s only visible by default via JMX. To enable it as an HTTP endpoint, 
add endpoints.shutdown.enabled=true to your application.properties file.