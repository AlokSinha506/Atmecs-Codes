package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.example.demo.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long>{
  
   Optional<Employee> findByEmployeeId(String employeeId);
}
