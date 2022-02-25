package com.example.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Manager extends Employee {
	
	private List<Employee> subordinates;
	long esal= getSalary();
	public List<Employee> getSubordinates() {		
		if (esal<50000)
		return subordinates;
		else
		return null;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "Manager [subordinates=" + subordinates + "]";
	}

}
