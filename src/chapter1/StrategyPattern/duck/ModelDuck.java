package chapter1.StrategyPattern.duck;

import chapter1.StrategyPattern.behavior.impl.FlyNoWay;
import chapter1.StrategyPattern.behavior.impl.Quack;

public class ModelDuck extends Duck{

	
	public ModelDuck() {
		setQuackBehavior(new Quack());
		setFlyBehavior(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("I am a model duck");
	}

}
