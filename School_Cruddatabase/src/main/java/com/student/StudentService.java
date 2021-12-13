package com.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class StudentService {

	@Autowired
	public StudentDAO studentdao;
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
	public void deleteSubject(String sid) {
		studentdao.deleteById(sid);
		
	}
}