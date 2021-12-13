package com.atmecs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atmecs.model.Student;
import com.atmecs.model.Subject;
import com.atmecs.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectrepository;

	public List<Subject> getALLSubjects() {
		List<Subject> subject=new ArrayList<>();
		subjectrepository.findAll().forEach(subject::add);
		return subject;
	}

	public void addSubject(Subject subject) {
		subjectrepository.save(subject);
		
	}

	public void updateSubject(String sname, Subject subject) {
		subjectrepository.save(subject);
		
	}

	public void deleteSubject(String sname) {
		subjectrepository.deleteById(sname);
	}

}
