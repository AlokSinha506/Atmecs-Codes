package com.atmecs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmecs.model.Student;
import com.atmecs.model.Teacher;
import com.atmecs.repository.TeacherRepository;
@Service
public class TeacherService {
	
	@Autowired
     public TeacherRepository teacherrepository;
	public List<Teacher> getALLTeacher() {
		List<Teacher> teacher=new ArrayList<>();
		teacherrepository.findAll().forEach(teacher::add);
		return teacher;
	}

	public void addTeacher(Teacher teacher) {
		teacherrepository.save(teacher);
		
	}

	public void updateTeacher(String tid, Teacher teacher) {
		teacherrepository.save(teacher);
		
	}

	public void deleteTeacher(String tid) {
		teacherrepository.deleteById(tid);
		
	}

}
