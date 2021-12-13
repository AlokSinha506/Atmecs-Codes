package com.atmecs.repository;

import org.springframework.data.repository.CrudRepository;

import com.atmecs.model.Teacher;

public interface TeacherRepository extends CrudRepository<Teacher,String> {

}
