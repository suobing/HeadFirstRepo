package chapter1.StrategyPattern.duck;

import chapter1.StrategyPattern.behavior.impl.FlyWithWings;
import chapter1.StrategyPattern.behavior.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior   = new FlyWithWings();
	}
	
	@Override
	public void display(){
		System.out.println("I'm a real Mallard Duck");
	}

}
