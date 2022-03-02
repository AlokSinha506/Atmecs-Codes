package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.serviceImpl.EmployeeServiceImpl;
@RestController
@RequestMapping("/password")
public class PasswordApiController {
	
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/{employeeId}")
	public ResponseEntity<String> getRandomPassword(@PathVariable("employeeId") String employeeId){
	    return ResponseEntity.ok(employeeServiceImpl.getRandomPassword());
		
	}
}
