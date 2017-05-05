package chapter2.ObserverPattern.javaapi;

import java.util.Observable;
import java.util.Observer;

import chapter2.ObserverPattern.diselmt.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");		
	}

	/**
	 * @param o
	 * @param arg 数据对象 ,不为空时,拉
	 */
	@Override
	public void update(Observable o, Object arg) {//arg为空, 推
		if(o instanceof WeatherData){
			WeatherData weatherData = (WeatherData)o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}

}
