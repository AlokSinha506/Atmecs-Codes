package com.atmecs.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Teacher {
	   @Id
       private String tid;
       private String tname;
       
       
       
	public Teacher() {
		super();
	}
	public Teacher(String tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + "]";
	}
       
       
}
