package com.designpatterns.prototype;

public class HumanResource extends Employee {

	public HumanResource(String name, String surname, int salary, byte age) {
		super(name, surname, salary, age, Title.HR);
	}

}
