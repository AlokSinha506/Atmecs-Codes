package com.example.demo.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.EmployeeRequest;

import reactor.core.publisher.Mono;
@Component
public class WebClientConfig {	
	      
	@Autowired
	WebClient webClient;
     String Password = webClient
  		                      .post()
  		                      .uri("/api/employee/{employeeId}")
  		                      .retrieve()
  		                      .bodyToFlux(EmployeeRequest.class)
  		                      .filter(employee ->{
  		                    	  employee.getPassword();
  		                      })
}
	//@Bean
//	public WebClient xxx {
//		return WebClient.builder()
//				.clientConnector()
//				.clientConnector(reactorClientHttpConnector())
//				.baseUrl().build();
//	}
//	private WebClient xxx;
//	String clientResponse =
//						contentStorageClient
//								.post()
//								.uri(uriBuilder -> uriBuilder.path("/api/employee/{employeeId}").build())
//								.retrieve()
//								.bodyToMono(EmployeePasswordResponse.class)
//								.block();
//				return this.saveAnswerContentResponse(clientResponse);
//}
