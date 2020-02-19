package com.designpatterns.iterator;

import java.util.List;

public class RadioStationAreaIterator implements RadioStationIterator {

	private BroadcastArea broadcastArea;
	private List<RadioStation> radioStations;
	private int index; 
	
	public RadioStationAreaIterator(BroadcastArea areaType, List<RadioStation> rsList) {
		this.broadcastArea = areaType;
		this.radioStations = rsList; 
	}
	
	@Override
	public boolean hasNext() {
		while(index < radioStations.size()) {
			RadioStation aStation = radioStations.get(index);
			if(aStation.getBroadcastArea().equals(broadcastArea)) {
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
