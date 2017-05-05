package chapter2.ObserverPattern.observer;

import chapter2.ObserverPattern.diselmt.DisplayElement;
import chapter2.ObserverPattern.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	//构造器需要主题对象
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);//注册自己到主题
	}

	/*observer能不能主动注册或取消呢...*/
	
	@Override
	public void update(float temp, float humi, float pres) {
		this.temperature = temp;
		this.humidity = humi;
		display();//更新数据后显示
	}

	@Override
	public void display() {
		System.out.println("Current conditions: "+temperature+"F degrees and "+humidity+"% humidity");
	}
}
