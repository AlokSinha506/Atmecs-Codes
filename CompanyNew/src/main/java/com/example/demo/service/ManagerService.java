package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;

public interface ManagerService {
	
Manager saveManager(Manager manager);
	
	List<Employee> getAllManagers();
	
	Employee getManagerById(long manager_id);
	
	Employee updateManager(Manager manager, long manager_id);
	
	void deleteManager(long manager_id);

}
