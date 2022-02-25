package com.example.demo.serviceImpl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
@Service 

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeerepository;

	public EmployeeServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeerepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeerepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> employee = employeerepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}else {
			throw new NotFoundException("Employee","Id",id);
		}
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
	      Employee existingEmployee= employeerepository.findById(id).orElseThrow(
	    		  ()-> new NotFoundException("Employee","Id",id));
	     existingEmployee.setName(employee.getName());
	     existingEmployee.setPassword(employee.getPassword());
	     existingEmployee.setRating(employee.getRating());
	     existingEmployee.setSalary(employee.getSalary());
	     
	     employeerepository.save(existingEmployee);
		return existingEmployee;
		
	}

	@Override
	public void deleteEmployee(long id) {
		
		 employeerepository.findById(id).orElseThrow(
	    		  ()-> new NotFoundException("Employee","Id",id));
		 
		employeerepository.deleteById(id);
		
	}
	


}
