package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class JavaJenkinsApplication {
	
	public static Logger log = LoggerFactory.getLogger(JavaJenkinsApplication.class);

	@PostConstruct
	public void initt() {
		log.info("Application Postconstruct called ....");
	}
	
	public static void main(String[] args) {
		log.info("########################Welcome to the Pipeline Jobs########################");
		log.info("Java and Jenkins Demo Application Started....");
		SpringApplication.run(JavaJenkinsApplication.class, args);
	}

}
