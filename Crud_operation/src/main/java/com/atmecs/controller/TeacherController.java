package com.atmecs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.model.Teacher;
import com.atmecs.service.TeacherService;

@RestController
public class TeacherController {
     @Autowired
	private TeacherService teacherservice;
     @RequestMapping("/teacher")
 	public List<Teacher> getAllTeacher(){
 		return teacherservice.getALLTeacher();	
     }
     @RequestMapping(method= RequestMethod.POST, value="/teacher")
     public void addteacher(@RequestBody Teacher teacher) {
     	teacherservice.addTeacher(teacher);
     }
     @RequestMapping(method= RequestMethod.PUT, value="/teacher/{id}")
     public void updateteacher(@PathVariable String tid,@RequestBody Teacher teacher) {
     	teacherservice.updateTeacher(tid,teacher);
     }
     @RequestMapping(method= RequestMethod.DELETE, value="/teacher/{id}")
     public void DeleteTeacher(@PathVariable String tid) {
     	teacherservice.deleteTeacher(tid);
     }
}
