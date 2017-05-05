package chapter2.ObserverPattern.subject;

import chapter2.ObserverPattern.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
