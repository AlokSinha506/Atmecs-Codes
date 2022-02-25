package com.atmecs.repository;

import org.springframework.data.repository.CrudRepository;


import com.atmecs.model.Student;



public interface StudentRepository extends CrudRepository<Student,String>{


	
}