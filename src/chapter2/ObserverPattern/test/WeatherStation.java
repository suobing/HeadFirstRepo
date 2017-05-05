package chapter2.ObserverPattern.test;

import chapter2.ObserverPattern.observer.CurrentConditionsDisplay;
import chapter2.ObserverPattern.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);

	}

}
