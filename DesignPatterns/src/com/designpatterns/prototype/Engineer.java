package com.designpatterns.prototype;

public class Engineer extends Employee {

	public Engineer(String name, String surname, int salary, byte age) {
		super(name, surname, salary, age, Title.ENGINEER);
	}

}
