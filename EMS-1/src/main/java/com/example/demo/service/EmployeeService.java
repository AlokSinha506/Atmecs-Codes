package com.example.demo.service;

import java.util.List;


import org.springframework.util.MultiValueMap;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeRequest;
import com.example.demo.model.EmployeeResponse;

public interface EmployeeService {

	EmployeeResponse saveEmployee(EmployeeRequest employeeRequest);

//	EmployeeResponse getEmployeeById(String empid) throws NotFoundException;
//
//	EmployeeResponse updateEmployee(EmployeeRequest employeeRequest) throws NotFoundException;
//
//	void deleteEmployee(String empid);	
//
//	void updateRating(String empid, float rating) throws NotFoundException;
//
//	void updateSalary(String empid,long salary) throws NotFoundException;

	//Assign manager to employees

	

	

}
