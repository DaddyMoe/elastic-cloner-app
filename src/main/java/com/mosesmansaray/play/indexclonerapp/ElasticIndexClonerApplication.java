package com.mosesmansaray.play.indexclonerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Application Configuration Class
 * <br/> <br/>
 * The SPRINGBOOTAPPLICATION is a convenience annotation that adds all of the following:
 * <br/> <br/>
 * The CONFIGURATION tags the class as a source of bean definitions for the application context.
 * The ENABLEAUTOCONFIGURATION tells Spring Boot to start adding beans based on classpath settings,
 * other beans, and various property settings.
 * <br/> <br/>
 * Normally you would add @EnableWebMvc for a Spring MVC app, but Spring Boot adds it automatically when it sees
 * spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors
 * such as setting up a DispatcherServlet.
 * ComponentScan tells Spring to look for other components, configurations, and services in the the hello package,
 * allowing it to find the HelloController.
 * <br/> <br/>
 * The main() method uses Spring Boot’s SpringApplication.run() method to launch an application. Did you notice that
 * there wasn’t a single line of XML? No web.xml file either. This web application is 100% pure Java and you didn’t
 * have to deal with configuring any plumbing or infrastructure.
 * <br/> <br/>
 * The run() method returns an ApplicationContext and this application then retrieves all the beans that were created
 * either by your app or were automatically added thanks to Spring Boot. It sorts them and prints them out.
 * <br/> <br/>
 * Run the application
 * <br/> <br/>
 * To run the application, execute: If you are using Maven, execute:
 * <br/> <br/>
 * "mvn package && java -jar target/cloneProperties-0.0.1-SNAPSHOT.jar"
 *
 * @author moses.mansaray
 */
@ComponentScan
@EnableAutoConfiguration
public class ElasticIndexClonerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticIndexClonerApplication.class, args);
    }

}
