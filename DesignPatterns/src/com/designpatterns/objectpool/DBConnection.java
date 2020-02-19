package com.designpatterns.objectpool;

public class DBConnection {

	public void select() {
		System.out.println("Select Query");
	}
	
	public void delete() {
		System.out.println("Delete Query");
	}
	
	public void update() {
		System.out.println("Update Query");
	}

}
