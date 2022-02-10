package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequest {
	
	private String employeeId;
	private String name;
	private String password;
	private Float rating;
	private Long salary;
	private EmployeeType type;
}
