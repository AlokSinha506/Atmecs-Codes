package com.example.demo.model;

import java.util.List;
import javax.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@DiscriminatorValue(value= "manager")
public class Manager extends Employee {
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="manager_id")
	private List<Employee> subordinates;
	
	
}
