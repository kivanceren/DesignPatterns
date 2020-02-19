package com.designpatterns.observer;

public class ObserverMain {

	public static void main(String[] args) {
		WeatherInformationService weatherInfoService = new WeatherInformationService();
		
		WeatherStation weatherStation1 = new WeatherStation(weatherInfoService);
		weatherInfoService.setTempreature(32.5);
		weatherInfoService.setWind(250);
		weatherInfoService.setHumidity(12);
		
		
		WeatherStation weatherStation2 = new WeatherStation(weatherInfoService);
		
		weatherInfoService.setTempreature(26.7);
		weatherInfoService.setWind(179);
		weatherInfoService.setHumidity(23);
		
	}

}


