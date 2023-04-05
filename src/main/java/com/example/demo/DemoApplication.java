package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ch.qos.logback.classic.Level;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        ch.qos.logback.classic.Logger log = (ch.qos.logback.classic.Logger)logger;
        log.setLevel(Level.TRACE); 

        logger.trace("trace message from main().");
        logger.debug("debug message from main().");
        logger.info("info message from main().");
        logger.warn("warn message from main().");
        logger.error("error message from main().");

		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
        Logger logger = LoggerFactory.getLogger(DemoApplication.class);
        ch.qos.logback.classic.Logger log = (ch.qos.logback.classic.Logger)logger;
        log.setLevel(Level.TRACE); 

        logger.trace("trace message from sayHello().");
        logger.debug("debug message from sayHello().");
        logger.info("info message from sayHello().");
        logger.warn("warn message from sayHello().");
        logger.error("error message from sayHello().");

		return "Hello World! XXXXYYYY";
	}
}
