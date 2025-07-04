package com.example.demo.serviceImpl;

import java.util.Arrays;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.exception.NotFoundException;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
      EmployeeRepository employeeRepository;
	@Autowired
      ManagerRepository managerRepository;
	@Autowired
      HrRepository hrRepository;
	@Autowired
      RoleRepository roleRepository;
     
    // EmployeeType employeeType;
     
     
	@Override
	public EmployeeResponse saveEmployee(EmployeeRequest employeeRequest) {
		Employee resp=null;
		switch(employeeRequest.getType()) {
		case EMPLOYEE:
			Role role= roleRepository.findByRole("employee")
				.orElse(Role.builder().role("employee").build());
			Employee emp = Employee.builder()
						.name(employeeRequest.getName())
						.password(employeeRequest.getPassword())
						.salary(employeeRequest.getSalary())
						.rating(employeeRequest.getRating())
						.employeeId(employeeRequest.getEmployeeId())
						.roles(Arrays.asList(role))
						.build();
			resp=employeeRepository.save(emp);
			break;
		case MANAGER:
			Role role1= roleRepository.findByRole("manager")
			.orElse(Role.builder().role("manager").build());
		   Role role2= roleRepository.findByRole("employee")
				   .orElse(Role.builder().role("employee").build());
			Manager manager= Manager.builder()
					.name(employeeRequest.getName())
					.password(employeeRequest.getPassword())
					.salary(employeeRequest.getSalary())
					.rating(employeeRequest.getRating())
					.employeeId(employeeRequest.getEmployeeId())
					.roles(Arrays.asList(role1,role2))
					.build();
			resp=managerRepository.save(manager);					
			break;
		case HR:
		   Role role4= roleRepository.findByRole("employee")
				   .orElse(Role.builder().role("employee").build());
		   Role role5= roleRepository.findByRole("hr")
				   .orElse(Role.builder().role("hr").build());
		  Hr hr=Hr.builder()
				  .name(employeeRequest.getName())
					.password(employeeRequest.getPassword())
					.salary(employeeRequest.getSalary())
					.rating(employeeRequest.getRating())
					.employeeId(employeeRequest.getEmployeeId())
					.roles(Arrays.asList(role4,role5))
					.build();
		  resp=hrRepository.save(hr);			
			break;
		}
		return EmployeeResponse.builder()
				.employeeId(resp.getEmployeeId())
				.name(resp.getName())
				.salary(resp.getSalary())
				.rating(resp.getRating()).build();
	}

	

//	@Override
//	public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new NotFoundException("Employee","Id",id);
//		}
//	}
//
//	@Override
//	public Employee updateEmployee(Employee employee, long id) {
//		 Employee existingEmployee= employeeRepository.findById(id).orElseThrow(
//	    		  ()-> new NotFoundException("Employee","Id",id));
//		
//		 
//		existingEmployee.setName(employee.getName());
//	    
//	     existingEmployee.setPassword(employee.getPassword());
//	     existingEmployee.setRating(employee.getRating());
//	     existingEmployee.setSalary(employee.getSalary());
//	     
//	     employeeRepository.save(existingEmployee);
//		return existingEmployee;
//	}
//
//	@Override
//	public void deleteEmployee(long id) {
//		 employeeRepository.findById(id).orElseThrow(
//	    		  ()-> new NotFoundException("Employee","Id",id));
//		 
//		employeeRepository.deleteById(id);
//		
//	}
//
//
//
//	@Override
//	public Employee updateRating(Employee employee,long id) {
//		if(role.equals(employeeType.MANAGER)||(role.equals(employeeType.HR))){
//			Employee employee1 = employeeRepository.findById(id).get();
//			employee1.setRating(employee);
//			employeeRepository.save(employee);
//		
//	}
//	}
//
//	@Override
//	public Employee updateSalary(Employee employee, long id) {
//		if(role.equals(employeeType.MANAGER)||(role.equals(employeeType.HR))){
//			Employee employee2 = employeeRepository.findById(id).get();
//			employee2.setSalary(employee);
//			employeeRepository.save(employee);
//			
//		}
//	}

}
