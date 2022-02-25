package com.example.demo.servicempl.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.servicempl.EmployeeServiceImpl;

public class EmployeeServiceImplTest {
    @InjectMocks
	EmployeeService employeeService;
    
    @Mock
    EmployeeRepository employeeRepository;
    
    @BeforeEach
    void setUp() throws Exception{
    	MockitoAnnotations.initMocks(this);
    }
    @Test
	final void GetAllEmployeesTest() {
		List<Employee> employees = new ArrayList<Employee>();
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("Karan");
		employee.setPassword("chip");
		employee.setRating(4f);
		employee.setSalary(33000l);
		employees.add(employee);
		when(employeeRepository.findAll()).thenReturn(employees);

		List<Employee> e1 = (List<Employee>) employeeService.getEmployeeById(1)
		assertNotNull(e1);
		assertEquals(1, e1.get(0).getId());

	}

	@Test
	final void addEmployeeTest() {
		Employee employee = new Employee();-
		when(employeeRepository.save(employee)).thenReturn(employee);
		assertThat(employee, employeeService.addEmployee(employee));
	}
    
    
    
    
    
    
    
    
    
}
