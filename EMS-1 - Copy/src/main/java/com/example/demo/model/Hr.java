package com.example.demo.model;

import javax.persistence.DiscriminatorValue;

import javax.persistence.Entity;

import lombok.Builder;
import lombok.experimental.SuperBuilder;
@Entity
@SuperBuilder
@DiscriminatorValue(value="hr")
public class Hr extends Employee {

}
