package com.designpatterns.factory;

public class CombatPlane extends Aircraft {
	
	public CombatPlane(String name, double velocity, double range, double damage) {
		setName(name);
		setVelocity(velocity);
		setRange(range);
		setDamage(damage);
	}
	
}
