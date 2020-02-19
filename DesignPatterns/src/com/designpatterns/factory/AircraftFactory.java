package com.designpatterns.factory;

public class AircraftFactory {
	
	public Aircraft createAircraft(String name, double velocity, double range, double damage, AircraftType aircraftType) {
		return (aircraftType == AircraftType.HELICOPTER) ? new Helicopter(name, velocity, range, damage)
				: new CombatPlane(name, velocity, range, damage);
	}

}
