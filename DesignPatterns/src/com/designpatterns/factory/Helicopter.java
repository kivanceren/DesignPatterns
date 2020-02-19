package com.designpatterns.factory;

public class Helicopter extends Aircraft{

	public Helicopter(String name, double velocity, double range, double damage) {
		setName(name);
		setVelocity(velocity);
		setRange(range);
		setDamage(damage);
	}
	
}
