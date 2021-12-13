package com.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	private String Sid;
	private String Sname;
	
	public Student() {
		
	}
	public Student(String sid, String sname) {
		super();
		Sid = sid;
		Sname = sname;
	}
	public String getSid() {
		return Sid;
	}
	public void setSid(String sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}

}
