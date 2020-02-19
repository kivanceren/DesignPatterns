package com.designpatterns.observer;

import java.util.ArrayList;

public class WeatherInformationService implements Observable {

	private ArrayList<Observer> observerList;
	private double temperature, wind, humidity;
	
	 public WeatherInformationService() {
		 observerList = new ArrayList<Observer>();
	}
	
	@Override
	public void subscribe(Observer newObserver) {
		observerList.add(newObserver);
	}

	@Override
	public void unsubscribe(Observer deleteObserver) {
		int observerIndex = observerList.indexOf(deleteObserver);
		System.out.println("Observer " + (observerIndex+1) + " deleted");
		observerList.remove(observerIndex);
	}

	@Override
	public void sendNotification() {
		for(Observer anObserver : observerList)
			anObserver.update(temperature, wind,  humidity);
	}
	
	public void setTempreature(double currentTemperature) {
		this.temperature = currentTemperature;
		sendNotification();
	}
	
	public void setWind(double currentWind) {
		this.wind = currentWind;
		sendNotification();
	}
	

	public void setHumidity(double currentHumidity) {
		this.humidity = currentHumidity;
		sendNotification();
	}
}
