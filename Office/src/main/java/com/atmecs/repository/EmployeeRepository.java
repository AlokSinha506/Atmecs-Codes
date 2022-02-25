package com.atmecs.repository;

import org.springframework.data.repository.CrudRepository;

import com.atmecs.model.Employee;



public interface EmployeeRepository extends CrudRepository<Employee,Long>{

	

}
