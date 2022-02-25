package com.example.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Employee;
import com.example.model.Manager;
import com.example.repository.EmployeeRepository;
import com.example.repository.ManagerRepository;
import com.example.service.ManagerService;
@Service
public class ManagerServiceImpl implements ManagerService {
    private BusinessLogic businesslogic;
	 private EmployeeRepository employeerepository;
	 private ManagerRepository managerrepository;
		public ManagerServiceImpl(EmployeeRepository employeerepository) {
			super();
			this.employeerepository = employeerepository;
		}
	@Override
	public Manager getSubordinates(Employee employee) {
		return businesslogic.getSubordinates(employee);
		

	}

}