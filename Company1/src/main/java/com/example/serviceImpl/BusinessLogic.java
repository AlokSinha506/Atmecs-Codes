package com.example.serviceImpl;

import com.example.model.Employee;
import com.example.model.Manager;
import com.example.repository.EmployeeRepository;
import com.example.repository.ManagerRepository;

public class BusinessLogic { 
	
	 private Employee employee;
	 private EmployeeRepository employeerepository;
	 private ManagerRepository managerrepository;  
	 
	 public Manager getSubordinates(Employee employee) {
	Employee employee1 = employeerepository.save(employee);
	if( employee1.getSalary()>50000) {
		managerrepository.save(employee1);		
	}else {	
	return  (Manager) employeerepository.save(employee1);
	}
	return null;
	 }
}



