package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.reactive.function.client.WebClient;




@Configuration
//@EnableWebSecurity
public class configuration {
	@Bean
	PasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder();
}
	@Bean
	public WebClient.Builder getWebClient(){
		return WebClient.builder();
	}
	
//	@Bean
//	public Password password() {
//		return new Password();
//	}
//	@Bean
//    WebClient webClient(){
//		return WebClient.create("http://localhost:8081");
//	}
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http
//		      .authorizeRequests()
//		      .anyRequest()
//		      .authenticated()
//		      .and()
//		      .httpBasic();
//	}
}
