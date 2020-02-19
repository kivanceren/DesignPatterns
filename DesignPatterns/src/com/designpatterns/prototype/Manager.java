package com.designpatterns.prototype;

public class Manager extends Employee {

	public Manager(String name, String surname, int salary, byte age) {
		super(name, surname, salary, age, Title.MANAGER);
	}
	

}
