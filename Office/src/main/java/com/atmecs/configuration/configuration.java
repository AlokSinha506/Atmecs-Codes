package com.atmecs.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atmecs.service.EmployeeService;

@Configuration
public class configuration {
	@Bean
	public EmployeeService employeeservice() {
		return new EmployeeService();
		
	}

}
