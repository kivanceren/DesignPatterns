package com.designpatterns.abstractfactory;

public class MacOSButton implements Button{
	@Override
	public void click() {
		System.out.println("MacOSButton Button Clicked!!!");
	}

	@Override
	public void doubleClick() {
		System.out.println("MacOSButton Button Double Clicked!!!");
	}

	@Override
	public void enterClick() {
		System.out.println("Enter pressed to MacOSButton Button");
	}
}
