package chapter2.ObserverPattern.subject;

import java.util.ArrayList;
import java.util.List;

import chapter2.ObserverPattern.observer.Observer;

public class WeatherData implements Subject{
	private List<Observer> observers;//记录观察者
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		observers = new ArrayList<Observer>();
	}
	
	//注册
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	//取消注册
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0){
			observers.remove(o);
		}
	}

	//挨个通知
	@Override
	public void notifyObservers() {
		for(int i=0;i<observers.size();i++){
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);//更新
		}
	}

	public void measurementsChanged(){//获取更新值时，通知观察者
		notifyObservers();
	}
	
	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
