package com.datajparest.domain;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Student extends Person {
	private String result;
}
