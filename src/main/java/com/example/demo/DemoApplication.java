package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo")
public class DemoApplication {

	public static void main(String[] args) {
		 System.setProperty("spring.profiles.active", "errorhandling");
		SpringApplication.run(DemoApplication.class, args);
	}

}
