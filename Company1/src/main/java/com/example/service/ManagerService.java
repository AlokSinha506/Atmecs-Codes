package com.example.service;

import com.example.model.Employee;
import com.example.model.Manager;

public interface ManagerService {
	
	Manager getSubordinates(Employee employee);

}
