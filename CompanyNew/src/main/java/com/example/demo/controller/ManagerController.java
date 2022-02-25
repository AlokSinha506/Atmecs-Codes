package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
import com.example.demo.service.ManagerService;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {
   private ManagerService managerservice;

public ManagerController(ManagerService managerservice) {
	super();
	this.managerservice = managerservice;
}
    
@PostMapping
public ResponseEntity<Employee> saveManager(@RequestBody Manager manager){
	return new ResponseEntity<Employee>(managerservice.saveManager(manager), HttpStatus.CREATED);
}
@GetMapping("{manager_id}")
public List<Employee> getAllManager(){
		return managerservice.getAllManagers();	  
}
@GetMapping
public ResponseEntity<Employee> getManagerById(@PathVariable("manager_id")long managerId){
	return new ResponseEntity<Employee>(managerservice.getManagerById(managerId),HttpStatus.OK);
} 
@PutMapping("{manager_id}")
public ResponseEntity<Employee> updateManager(@PathVariable("manager_id") long manager_id,
		@RequestBody Manager manager){
	return new ResponseEntity<Employee>(managerservice.updateManager(manager,manager_id),HttpStatus.OK);
		
}
@DeleteMapping("{manager_id}")
public ResponseEntity<String> deleteManager(@PathVariable("manager_id") long manager_id){
	 
	managerservice.deleteManager(manager_id);
	return new ResponseEntity<String>("Id is deleted successfully",HttpStatus.OK);
}

}
