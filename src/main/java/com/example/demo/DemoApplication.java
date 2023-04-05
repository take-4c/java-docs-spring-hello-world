package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class DemoApplication {

	private Logger logger = null;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	String sayHello() {
		
		this.logger = Logger.getLogger(DemoApplication.class.getName());
        this.logger.setLevel(Level.SEVERE);

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
