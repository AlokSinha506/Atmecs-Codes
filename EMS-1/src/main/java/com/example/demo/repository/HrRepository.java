package com.example.demo.repository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.Hr;
@Repository
public interface HrRepository extends CrudRepository<Employee, Long>{
Optional<Hr> findByEmployeeId(String empid);
}
