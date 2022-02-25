package com.example.demo.reposiory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface UserDetails extends CrudRepository<Employee, Long>{

}
