package com.atmecs.service;

import java.util.ArrayList;
import java.util.List;

import com.atmecs.model.Employee;

import com.atmecs.repository.EmployeeRepository;

public class EmployeeService {
      
	public EmployeeRepository employeerepository;
	public List<Employee> getALLEmployees() {
		List<Employee> employees=new ArrayList<>();
		employeerepository.findAll().forEach(employees::add);
		return null;
	}
	public void addEmployee(Employee employee) {
		employeerepository.save(employee);
		
	}
	public void updateEmployee(String id, Employee employee) {
		employeerepository.save(employee);
		
	}
	public void deleteEmployee(Long id) {
		employeerepository.deleteById(id);
		
	}

}
