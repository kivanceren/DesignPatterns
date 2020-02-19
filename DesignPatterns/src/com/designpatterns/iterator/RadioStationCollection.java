package com.designpatterns.iterator;

public interface RadioStationCollection {
	public void addChanel(RadioStation rs);
	public void removeChannel(RadioStation rs);
	public RadioStationIterator iterator(RadioStationType rsType);
	public RadioStationIterator iterator(BroadcastArea broadArea);
}
