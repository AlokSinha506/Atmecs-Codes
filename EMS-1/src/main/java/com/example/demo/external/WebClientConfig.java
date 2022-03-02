package com.example.demo.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeRequest;
import com.example.demo.model.Password;

import reactor.core.publisher.Mono;
@Component
public class WebClientConfig {	
	      
	@Autowired
	private WebClient.Builder webClient;
	
	@Autowired
	Password password;
	
	public Password getPassword(){
                           return  webClient
    		                  .build()
  		                      .get()
  		                      .uri("http://localhost:8085/password/+employeeId")
  		                      .retrieve()
  		                      .bodyToMono(Password.class)
  		                      .block();
  		                   
                          }
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
