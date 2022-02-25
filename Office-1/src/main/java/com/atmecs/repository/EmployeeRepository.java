package com.atmecs.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import com.atmecs.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
