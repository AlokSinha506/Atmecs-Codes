package com.atmecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
@EnableConfigurationProperties
@SpringBootApplication
public class CrudOperationJooqApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOperationJooqApplication.class, args);
	}

}
