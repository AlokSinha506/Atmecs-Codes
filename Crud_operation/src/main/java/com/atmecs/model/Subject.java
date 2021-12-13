package com.atmecs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subject {
	@Id
	private String sname;
	private int marks;
	
	
	public Subject() {
		super();
	}
	public Subject(String sname, int marks) {
		super();
		this.sname = sname;
		this.marks = marks;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Subject [sname=" + sname + ", marks=" + marks + "]";
	}
	
	
	
}
	
	