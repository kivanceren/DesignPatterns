package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class RadioStationCollectionImpl implements RadioStationCollection{

	private List<RadioStation> radioStationList;
	
	public RadioStationCollectionImpl() {
		radioStationList = new ArrayList<RadioStation>();
	}
	
	@Override
	public void addChanel(RadioStation rs) {
		radioStationList.add(rs);
	}

	@Override
	public void removeChannel(RadioStation rs) {
		radioStationList.remove(rs);
	}


	@Override
	public RadioStationIterator iterator(RadioStationType rsType) {
		return new RadioStationTypeIterator(rsType, this.radioStationList);
	}

	@Override
	public RadioStationIterator iterator(BroadcastArea broadcastArea) {
		return new RadioStationAreaIterator(broadcastArea, this.radioStationList);
	}

}
