package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import com.example.demo.model.EmployeeRequest;
import com.example.demo.model.EmployeeResponse;
import com.example.demo.exception.NotFoundException;

@RestController

public class EmployeeController {
        @Autowired
		 EmployeeService employeeservice;

//		public EmployeeController(EmployeeService employeeservice) {
//			super();
//			this.employeeservice = employeeservice;
//		}
		@PostMapping("/api/employees")
		public ResponseEntity saveEmployee(@RequestBody EmployeeRequest employeeRequest){
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(employeeservice.saveEmployee(employeeRequest));
		}
//		@GetMapping("{id}")
//	  public List<Employee> getAllEmployees(){
//			return employeeservice.getAllEmployees();	  
//	  }
//		@GetMapping
//		public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")long id){
//			return new ResponseEntity<Employee>(employeeservice.getEmployeeById(id),HttpStatus.OK);
//		} 
//		@PutMapping("{id}")
//		public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,
//				@RequestBody Employee employee){
//			return new ResponseEntity<Employee>(employeeservice.updateEmployee(employee,id),HttpStatus.OK);
//				
//		}
//		@DeleteMapping("{id}")
//		public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
//			 
//			employeeservice.deleteEmployee(id);
//			return new ResponseEntity<String>("Id is deleted successfully",HttpStatus.OK);
//		}
//		@PatchMapping("{id}")
//		public ResponseEntity<Employee> updateSalary(@PathVariable("id") long id,
//				@RequestBody Employee employee){
//			return new ResponseEntity<Employee>(employeeservice.updateSalary(employee,id), HttpStatus.OK);
//			
//        }
//		@PatchMapping("{id}")
//		public ResponseEntity<Employee> updateRating(@PathVariable("id") long id,
//				@RequestBody Employee employee){
//			return new ResponseEntity<Employee>(employeeservice.updateRating(employee,id), HttpStatus.OK);
//			
//}
}
