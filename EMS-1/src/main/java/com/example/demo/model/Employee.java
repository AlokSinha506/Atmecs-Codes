package com.example.demo.model;

import java.util.List;


import javax.persistence.*;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorValue(value="employee")
@DiscriminatorColumn(name="type")
public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String employeeId;
	private String name;
	private String password;
	private Float rating;
	private Long salary;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER)
	private List<Role> roles;
    
}
