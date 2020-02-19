package com.designpatterns.factory;

public class FactoryExample {
	public static void main(String[] args) {
		AircraftFactory aircraftFactory = new AircraftFactory();
		
		Aircraft helicopter = aircraftFactory.createAircraft("AH-64", 27, 150, 2500, AircraftType.HELICOPTER);
		Aircraft combatPlane = aircraftFactory.createAircraft("Boeing B-17/G", 45, 482, 3250, AircraftType.COMBATPLANE);

		System.out.println("For Helicopter Object the Type is: " + helicopter.getClass().getTypeName());
		System.out.println("For CombatPlane Object the Type is: " + combatPlane.getClass().getTypeName());

		System.out.println("\n"+combatPlane.getDamage());
		System.out.println(combatPlane.getName());
		System.out.println(combatPlane.getRange());
		System.out.println(combatPlane.getVelocity()+"\n");

		
		System.out.println(helicopter.getRange());
	}
}
