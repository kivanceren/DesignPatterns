package com.designpatterns.abstractfactory;

public class LinuxButton implements Button{

	@Override
	public void click() {
		System.out.println("Linux Button Clicked!!!");
	}

	@Override
	public void doubleClick() {
		System.out.println("Linux Button Double Clicked!!!");
	}

	@Override
	public void enterClick() {
		System.out.println("Enter pressed to Linux Button");
	}

}
