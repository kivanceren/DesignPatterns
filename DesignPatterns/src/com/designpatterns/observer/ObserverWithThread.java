package com.designpatterns.observer;

import java.util.Random;

public class ObserverWithThread implements Runnable {
	private static String[] weatherInfoType = {"Temperature", "Wind", "Humidity"};	
	private Observable weatherInfoService;
	
	public ObserverWithThread(Observable weatherInfoService) {
		this.weatherInfoService = weatherInfoService;
	}

	@Override
	public void run() {
		for(int i = 1; i <= 20; i++){
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){}
			
			Random r = new Random();
			int randomIndex = r.nextInt(weatherInfoType.length);
			//Rastgeler bir hava durumu bilgisi se�ip onu de�i�tir
			String randomWeatherInfoType = weatherInfoType[randomIndex];
			
			if(randomWeatherInfoType.equals("Temperature")) {
				//-5 derece ile 37 derece aras� rastgele bir s�cakl�k �retme
				double currentTemp =  -5 + new Random().nextDouble() * (37 - (-5));
				((WeatherInformationService) weatherInfoService).setTempreature(currentTemp);
			}
			
			else if(randomWeatherInfoType.equals("Wind")) {
				//100 derece ile 238 m/s aras� rastgele bir r�zgar �retme
				double currentWind = 100 + new Random().nextDouble() * (238 - 100);
				((WeatherInformationService) weatherInfoService).setWind(currentWind);
			}
			
			else {
				//%1 ile %100 aras� rastgele bir nem oran� �retme
				double currentHumidity = 1 + new Random().nextDouble() * (100 - 1);
				((WeatherInformationService) weatherInfoService).setHumidity(currentHumidity);
			}
		}
	}
	
	
	
	
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
		
		//A�a��daki kod silinirse silinirse Thread uygulamas� her iki station i�inde �al��acakt�r
		weatherInfoService.unsubscribe(weatherStation1);
		
		
		new ObserverWithThread(weatherInfoService).run();
		
		
	}


}


