package com.designpatterns.prototype;

public enum Title {
	MANAGER("Manager"),
	ENGINEER("Engineer"),
	HR("Human Resource"),
	SALES("Sales");
	
	private String titleString;
	
	private Title(String titleString) {
		this.titleString = titleString;
	}
	
	
	public String getTitleName() { return titleString; }
}
