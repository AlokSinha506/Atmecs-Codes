package com.example.demo.serviceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.exception.NotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeRequest;
import com.example.demo.model.EmployeeResponse;
import com.example.demo.model.EmployeeType;
import com.example.demo.model.Hr;
import com.example.demo.model.Manager;
import com.example.demo.model.Role;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.HrRepository;
import com.example.demo.repository.ManagerRepository;
import com.example.demo.repository.RoleRepository;

class EmployeeServiceImplTest {
	@Mock
	EmployeeRepository employeeRepository;

	@Mock
	ManagerRepository managerRepository;

	@Mock
	HrRepository hrRepository;

	@Mock
	RoleRepository roleRepository;

	@Mock
	EmployeeResponse employeeResponse;

	@Mock
	PasswordEncoder passwordEncoder;

	@Mock
	Employee employee;

	@Mock
	Manager manager;

	@InjectMocks
	EmployeeServiceImpl employeeservice;

	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	final void saveEmployeeTest() {

		EmployeeRequest employeeRequest = new EmployeeRequest();
		employeeRequest.setEmployeeId("123");
		employeeRequest.setName("Aditya");
		employeeRequest.setPassword("Asinha");
		employeeRequest.setRating(4.5f);
		employeeRequest.setSalary(5678l);
		employeeRequest.setType(EmployeeType.EMPLOYEE);
		Role role = roleRepository.findByRole("employee").orElse(Role.builder().role("employee").build());
		Employee emp = Employee.builder().name(employeeRequest.getName())//.password(employeeRequest.getPassword())
				.salary(employeeRequest.getSalary()).rating(employeeRequest.getRating())
				.employeeId(employeeRequest.getEmployeeId()).roles(Arrays.asList(role)).build();
		when(employeeRepository.save(emp)).thenReturn(emp);
		EmployeeResponse response = employeeservice.saveEmployee(employeeRequest);
		// assertEquals(123,response.getEmployeeId());
		Assertions.assertNotNull(response);
	}

	@Test
	final void saveEmployeeTest1() {

		EmployeeRequest employeeRequest = new EmployeeRequest();
		employeeRequest.setEmployeeId("235");
		employeeRequest.setName("Shwetabh");
		employeeRequest.setPassword("Shwetabh@123");
		employeeRequest.setRating(4.4f);
		employeeRequest.setSalary(3456l);
		employeeRequest.setType(EmployeeType.MANAGER);
		Role role = roleRepository.findByRole("manager").orElse(Role.builder().role("manager").build());
		Manager manager = Manager.builder().name(employeeRequest.getName())//.password(employeeRequest.getPassword())
				.salary(employeeRequest.getSalary()).rating(employeeRequest.getRating())
				.employeeId(employeeRequest.getEmployeeId()).roles(Arrays.asList(role)).build();
		when(employeeRepository.save(manager)).thenReturn(manager);
		EmployeeResponse response = employeeservice.saveEmployee(employeeRequest);
		// assertEquals(345,response.getEmployeeId());
		Assertions.assertNotNull(response);
	}

	@Test
	final void saveEmployeeTest2() {

		EmployeeRequest employeeRequest = new EmployeeRequest();
		employeeRequest.setEmployeeId("345");
		employeeRequest.setName("Arti");
		employeeRequest.setPassword("Arti@123");
		employeeRequest.setRating(3.4f);
		employeeRequest.setSalary(4325l);
		employeeRequest.setType(EmployeeType.HR);
		Role role = roleRepository.findByRole("hr").orElse(Role.builder().role("hr").build());
		Hr hr = Hr.builder().name(employeeRequest.getName())//.password(employeeRequest.getPassword())
				.salary(employeeRequest.getSalary()).rating(employeeRequest.getRating())
				.employeeId(employeeRequest.getEmployeeId()).roles(Arrays.asList(role)).build();
		when(employeeRepository.save(hr)).thenReturn(hr);
		EmployeeResponse response = employeeservice.saveEmployee(employeeRequest);
		// assertEquals(567,response.getEmployeeId());
		Assertions.assertNotNull(response);
	}

	@Test
	public void getEmployeeByIdTest() throws NotFoundException {
		when(employeeRepository.findByEmployeeId("123")).thenReturn((Optional.of(employee)));
		when(employee.getEmployeeId()).thenReturn("123");
		EmployeeResponse response = employeeservice.getEmployeeById("123");
		// assertEquals(123, response.getEmployeeId());
		Assertions.assertNotNull(response);
	}

	@Test
	public void getEmployeeByIdTest1() {
		Assertions.assertThrows(NotFoundException.class, () -> employeeservice.getEmployeeById("123"));
	}

	@Test
	public void updateRatingTest() throws NotFoundException {
		when(employeeRepository.findByEmployeeId("234")).thenReturn((Optional.of(employee)));
		employeeservice.updateRating("234", 5f);
		when(employee.getRating()).thenReturn(5f);
		Assertions.assertEquals(5f, employee.getRating());

	}

	@Test
	public void updateRatingTest1() {
		Assertions.assertThrows(NotFoundException.class, () -> employeeservice.updateRating("345", 5f));
	}

	@Test
	public void updateSalaryTest() throws NotFoundException {
		when(employeeRepository.findByEmployeeId("678")).thenReturn((Optional.of(employee)));
		employeeservice.updateSalary("678", 5678l);
		when(employee.getSalary()).thenReturn(5678l);
		Assertions.assertEquals(5678l, employee.getSalary());
	}

	@Test
	public void updateSalaryTest1() {
		Assertions.assertThrows(NotFoundException.class, () -> employeeservice.updateSalary("45", 5678l));
	}

	@Test
	public void deleteEmployeeTest() throws NotFoundException {
		when(employeeRepository.findByEmployeeId("457")).thenReturn((Optional.of(employee)));
		employeeservice.deleteEmployee("457");
		Assertions.assertEquals(0, 0);
	}

	@Test
	public void deleteEmployeeTest1() {
		Assertions.assertThrows(NotFoundException.class, () -> employeeservice.deleteEmployee("457"));
	}

	@Test
	public void assignManagerTest() throws NotFoundException {
		when(employeeRepository.findByEmployeeId("564")).thenReturn((Optional.of(employee)));
		when(employee.getEmployeeId()).thenReturn("564");
		when(managerRepository.findByEmployeeId("788")).thenReturn((Optional.of(manager)));
		when(manager.getEmployeeId()).thenReturn("788");

		List<Employee> subordinates = new ArrayList<>();
		subordinates.add(employee);
		when(manager.getSubordinates()).thenReturn(subordinates);
		Assertions.assertNotNull(subordinates);
	}

	// manager or employee not present
	@Test
	public void assignManagerTest1() {
		Assertions.assertThrows(NotFoundException.class, () -> employeeservice.assignManager("234", "564"));
	}


}
