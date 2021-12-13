package com.atmecs.confurigation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atmecs.service.StudentService;

@Configuration
public class confurigation {
	@Bean
	public StudentService studentservice(){
		return new StudentService();
	}

}
