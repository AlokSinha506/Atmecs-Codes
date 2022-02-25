package com.example.demo.repository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.Manager;
@Repository
public interface ManagerRepository extends CrudRepository<Manager, String>{
	
  // Optional<Manager> findEmployeeById(String empid);
	 Optional<Manager> findByEmployeeId(String employeeId);
}
