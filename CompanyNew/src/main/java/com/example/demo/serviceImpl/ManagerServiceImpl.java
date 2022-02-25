package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService{
	
	private EmployeeRepository employeerepository;

	public ManagerServiceImpl(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}

	@Override
	public Manager saveManager(Manager manager) {
		return employeerepository.save(manager);
	}

	@Override
	public List<Employee> getAllManagers() {
		return employeerepository.findAll();
	}

	@Override
	public Employee getManagerById(long manager_id) {
		Optional<Employee> manager = employeerepository.findById(manager_id);
		if(manager.isPresent()) {
			return manager.get();
		}else {
			throw new NotFoundException("Employee","Id",manager_id);
		}
	}

	@Override
	public Employee updateManager(Manager manager, long manager_id) {
		 Employee existingManager= employeerepository.findById(manager_id).orElseThrow(
	    		  ()-> new NotFoundException("Manager","Id",manager_id));
		 existingManager.setName(manager.getName());
		 existingManager.setPassword(manager.getPassword());
		 existingManager.setRating(manager.getRating());
		 existingManager.setSalary(manager.getSalary());
	     
	     employeerepository.save(existingManager);
		return existingManager;
		
	}

	@Override
	public void deleteManager(long manager_id) {
		 employeerepository.findById(manager_id).orElseThrow(
	    		  ()-> new NotFoundException("Manager","Id",manager_id));
		 
		employeerepository.deleteById(manager_id);
		
		
	}

	
	}
	


