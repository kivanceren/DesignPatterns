package com.designpatterns.factory;

public abstract class Aircraft {
	private String name;
	private double velocity;
	private double range;
	private double damage;
	
	public void fly() {
		System.out.println( name + " is flying with" + velocity + " km/h" );
	}
	
	public void lockToTarget() {
		System.out.println(name + " can be locking to the enemy target from" + range + " km far away");
	}
	
	public double getDamage() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVelocity() {
		return velocity;
	}

	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}
	
	

}
