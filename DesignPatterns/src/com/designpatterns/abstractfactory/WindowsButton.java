package com.designpatterns.abstractfactory;

public class WindowsButton implements Button {
	@Override
	public void click() {
		System.out.println("WindowsButton Button Clicked!!!");
	}

	@Override
	public void doubleClick() {
		System.out.println("WindowsButton Button Double Clicked!!!");
	}

	@Override
	public void enterClick() {
		System.out.println("Enter pressed to WindowsButton Button");
	}
}
