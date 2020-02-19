package com.designpatterns.iterator;

public class RadioStationIteratorExamples {
	
	public static void main(String[] args) {
		RadioStationCollection radioStations = createRadioStationList();
		
		System.out.println("Iterator For Radio Station Music Type");
		//Müzik Türüne Göre Ýteratör
		RadioStationIterator rsTypeIterator = radioStations.iterator(RadioStationType.TRADITIONAL_MUSIC);
		while(rsTypeIterator.hasNext()) {
			RadioStation rs = rsTypeIterator.next();
			System.out.println(rs.toString());
		}
		
		System.out.println("\nIterator For Broadcast Area");
		
		//Radyo Yayýn Alanýna Göre Ýteratör
		RadioStationIterator rsAreaIterator = radioStations.iterator(BroadcastArea.REGIONAL);
		while(rsAreaIterator.hasNext()) {
			RadioStation rs = rsAreaIterator.next();
			System.out.println(rs.toString());
		}
		
	}
	
	
	public static RadioStationCollection createRadioStationList() {
		RadioStationCollection rsCollection = new RadioStationCollectionImpl();
		rsCollection.addChanel(new RadioStation("Number One Türk", 98.6, RadioStationType.TRADITIONAL_MUSIC, BroadcastArea.NATIONAL));
		rsCollection.addChanel(new RadioStation("Fenerbahçe FM", 97.0, RadioStationType.MIXED_MUSIC, BroadcastArea.REGIONAL));
		rsCollection.addChanel(new RadioStation("Radyo Eksen", 96.2, RadioStationType.FOREIGN_MUSIC, BroadcastArea.REGIONAL));
		rsCollection.addChanel(new RadioStation("Slow Türk", 98.2, RadioStationType.TRADITIONAL_MUSIC, BroadcastArea.NATIONAL));
		rsCollection.addChanel(new RadioStation("Alem FM", 98.2, RadioStationType.MIXED_MUSIC, BroadcastArea.NATIONAL));
		rsCollection.addChanel(new RadioStation("Trafik Ýstanbul", 87.7, RadioStationType.NEWS, BroadcastArea.REGIONAL));
		rsCollection.addChanel(new RadioStation("Joy Türk", 89.0, RadioStationType.TRADITIONAL_MUSIC, BroadcastArea.NATIONAL));
		rsCollection.addChanel(new RadioStation("Bloomberg HT", 92.7, RadioStationType.NEWS, BroadcastArea.REGIONAL));
		rsCollection.addChanel(new RadioStation("CNN Türk", 92.5, RadioStationType.NEWS, BroadcastArea.REGIONAL));
		rsCollection.addChanel(new RadioStation("Radyo Spor", 10.72, RadioStationType.SPORT, BroadcastArea.NATIONAL));
		return rsCollection;
	}

}
