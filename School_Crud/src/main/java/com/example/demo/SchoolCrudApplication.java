package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableConfigurationProperties
@SpringBootApplication
public class SchoolCrudApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SchoolCrudApplication.class, args);
	}

}
