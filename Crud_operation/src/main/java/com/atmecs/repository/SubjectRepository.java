package com.atmecs.repository;

import org.springframework.data.repository.CrudRepository;

import com.atmecs.model.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String> {

}
