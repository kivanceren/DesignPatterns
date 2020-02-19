package com.designpatterns.observer;

public class WeatherStation implements Observer{

	private double temperature, wind, humidity;
	private Observable weatherInformationService;
	
	private static int observerIDTracker = 0;
    private int observerID;
	
	
	
	
	public WeatherStation(Observable weatherInfoService) {
		this.weatherInformationService = weatherInfoService;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer Subscribed with ID:" + observerID +"\n");
		weatherInfoService.subscribe(this);
	}
	
	
	@Override
	public void update(double temperature, double wind, double humidity) {
		this.temperature = temperature;
		this.wind = wind;
		this.humidity = humidity;
		printCurrentWeatherInfos();
	}
	
	public void printCurrentWeatherInfos() {
		  System.out.println("Station " +observerID + "\nTemperature: " + temperature + " Celcius \nWind: " +
				  	                wind + "m/s\nHumidity: " + humidity + "%\n");
	}

}
