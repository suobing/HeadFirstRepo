package chapter2.ObserverPattern.javaapi;

import java.util.Observable;

public class WeatherData extends Observable{
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {}
	
	public void measurementsChanged(){
		setChanged();//继承
		notifyObservers();//继承, 调用update, 拉
	}
	
	public void setMeasurements(float temp, float humi, float pres){
		this.temperature = temp;
		this.humidity = humi;
		this.pressure = pres;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
	
}
