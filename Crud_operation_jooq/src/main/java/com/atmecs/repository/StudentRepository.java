package com.atmecs.repository;

import java.sql.Connection;

import org.jooq.*;
import org.jooq.impl.*;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DAOImpl;
import org.jooq.impl.DSL;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import com.atmecs.model.Student;
@Repository
public class StudentRepository implements CommandLineRunner {
	DSLContext ctx = DSL.using("jdbc:url:school_database", "root", "password");
	
	@Override
	public void run(String... args) throws Exception {
	
	}

	public Iterable<Student> findAll() {
     
		return null;
	}

	public void save(Student student) {
	
		
	}

	public void deleteById(String sid) {
		
		
	}

}
