package com.designpatterns.iterator;

public class RadioStation {
	
	private String name;
	private double frequency;
	private RadioStationType stationType;
	private BroadcastArea broadcastArea;
		
	public String getName() {
		return name;
	}
	public double getFrequency() {
		return frequency;
	}
	public RadioStationType getStationType() {
		return stationType;
	}
	public BroadcastArea getBroadcastArea() {
		return broadcastArea;
	}
	
	
	public RadioStation(String name, double frequency, RadioStationType stationType, BroadcastArea broadcastArea) {
		super();
		this.name = name;
		this.frequency = frequency;
		this.stationType = stationType;
		this.broadcastArea = broadcastArea;
	}
	
	@Override
	public String toString() {
		return "RadioStation [name=" + name + ", frequency=" + frequency + ", stationType=" + stationType
				+ ", broadcastArea=" + broadcastArea + "]";
	}
	
	
}
