package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.function.Supplier;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

@SpringBootApplication
@RestController
public class DemoApplication {

	private Logger logger = null;

	public static void main(String[] args) {
        
		this.logger = Logger.getLogger(DemoApplication.class.getName());
        this.logger.setLevel(Level.SEVERE);

		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {

		this.logger.finest("FINESTメッセージ");
        this.logger.finer("FINERメッセージ");
        this.logger.fine("FINEメッセージ");
        this.logger.config("CONFIGメッセージ");
        this.logger.info("INFOメッセージ");
        this.logger.warning("WARNINGメッセージ");
        this.logger.severe("SEVEREメッセージ");

		return "Hello World! This is a sample java program!";
	}
}
