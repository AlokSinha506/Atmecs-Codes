package com.example.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Hr {
	
	private List<Employee> getManagers;
	private List<Employee> getEmployees;
	
	
	public List<Employee> getGetManagers() {
		return getManagers;
	}
	public void setGetManagers(List<Employee> getManagers) {
		this.getManagers = getManagers;
	}
	public List<Employee> getGetEmployees() {
		return getEmployees;
	}
	public void setGetEmployees(List<Employee> getEmployees) {
		this.getEmployees = getEmployees;
	}
	
	

}
