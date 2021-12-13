package com.atmecs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmecs.model.Student;
import com.atmecs.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentdao;
	public List<Student> getALLStudents(){
		
		List<Student> students=new ArrayList<>();
	studentdao.findAll().forEach(students::add);
	return students;
	}
	public void addStudent(Student student) {
		studentdao.save(student);
	}
	public void updateStudent(String sid, Student student) {
		studentdao.save(student);
		
	}
	public void deleteStudent(String sid) {
		studentdao.deleteById(sid);
		
	}

}
