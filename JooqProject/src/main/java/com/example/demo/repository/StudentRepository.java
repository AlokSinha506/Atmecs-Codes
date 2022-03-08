package com.example.demo.repository;

import org.jooq.DSLContext;
import org.jooq.impl.DSL;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
	DSLContext ctx = DSL.using("jdbc:url:student", "root", "password");
	 
}
