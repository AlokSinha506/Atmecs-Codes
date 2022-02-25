package com.atmecs.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.model.Employee;

import com.atmecs.service.EmployeeService;


@RestController
public class EmployeeController {
	
	 @Autowired
		private EmployeeService employeeservice;
	    @RequestMapping("/employees")
		public List<Employee> getAllEmployee(){
			return employeeservice.getALLEmployees();	
	    }
	    @RequestMapping(method= RequestMethod.POST, value="/employees")
	    public void addemployee(@RequestBody Employee employee) {
	    	employeeservice.addEmployee(employee);
	    }
	    @RequestMapping(method= RequestMethod.PUT, value="/employees/{id}")
	    public void updateemployee(@PathVariable String id,@RequestBody Employee employee ) {
	    	employeeservice.updateEmployee(id,employee);
	    }
	    @RequestMapping(method= RequestMethod.DELETE, value="/employees/{id}")
	    public void DeleteEmployee(@PathVariable Long id) {
	    	employeeservice.deleteEmployee(id);
	    }
}
