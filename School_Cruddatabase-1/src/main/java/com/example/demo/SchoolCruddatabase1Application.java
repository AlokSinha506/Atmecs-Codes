package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SchoolCruddatabase1Application implements CommandLineRunner{
	
      @Autowired
      private JdbcTemplate jdbctemplate;
	public static void main(String[] args) {
		SpringApplication.run(SchoolCruddatabase1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql="INSERT INTO student(sid,sname) VALUES(?,?)";
		int result=jdbctemplate.update(sql,"1","Tom");
		if (result>0) {
			System.out.println("Data Inserted");
		}
		
	}

}
