package com.example.demo.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
@Component
public class WebClientConfig {	
	      
	@Autowired
	private WebClient.Builder webClient;
	
//	@Autowired
//	Password password;
	
	public String getRandomPassword(){
                           return  webClient
    		                  .build()
  		                      .get()
  		                      .uri("http://localhost:8085/")
  		                      .retrieve()
  		                      .bodyToMono(String.class)
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
