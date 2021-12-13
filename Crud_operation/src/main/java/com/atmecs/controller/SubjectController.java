package com.atmecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.model.Student;
import com.atmecs.model.Subject;
import com.atmecs.service.SubjectService;

@RestController
public class SubjectController {
	 @Autowired
		private SubjectService subjectservice;
	    @RequestMapping("/subjects")
		public List<Subject> getAllSubjects(){
			return subjectservice.getALLSubjects();	
			}
	    @RequestMapping(method= RequestMethod.POST, value="/subjects")
	    public void addsubject(@RequestBody Subject subject) {
	    	subjectservice.addSubject(subject);
	    }
	    @RequestMapping(method= RequestMethod.PUT, value="/subjects/{sname}")
	    public void updatesubject(@PathVariable String sname,@RequestBody Subject subject) {
	    	subjectservice.updateSubject(sname,subject);
	    }
	    @RequestMapping(method= RequestMethod.DELETE, value="/subjects/{sname}")
	    public void DeleteSubject(@PathVariable String sname) {
	    	subjectservice.deleteSubject(sname);
	    }

	    
	    
}