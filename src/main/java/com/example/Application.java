package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
        log.info("Welcome to the Spring Boot Application! Let's have some fun!");
    }

    @PostConstruct
    public void init()
    {
        log.info("Java app started");
        log.info("My name is Benjamin Baden, and I am a DevOps engineer!");
        log.info("Let's automate all the things and keep the code flowing smoothly!");
    }

    public String getStatus() {
        return "OK - All systems are go!";
    }
}
