package com.designpatterns.iterator;

import java.util.List;

public class RadioStationTypeIterator implements RadioStationIterator {

	private RadioStationType radioStationType;
	private List<RadioStation> radioStations;
	private int index; 
	
	public RadioStationTypeIterator(RadioStationType rsType, List<RadioStation> rsList) {
		this.radioStationType = rsType;
		this.radioStations = rsList; 
	}
	
	@Override
	public boolean hasNext() {
		while(index < radioStations.size()) {
			RadioStation aStation = radioStations.get(index);
			if(aStation.getStationType().equals(radioStationType)) {
				return true;
			}else index++;
		}
		return false;
	}

	@Override
	public RadioStation next() {
		RadioStation rs = radioStations.get(index);
		index++;
		return rs;
	}
}
