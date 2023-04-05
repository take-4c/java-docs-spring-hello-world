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

        logger.trace("trace message");
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warn message");
        logger.error("error message");

		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		return "Hello World! XXXX";
	}
}
