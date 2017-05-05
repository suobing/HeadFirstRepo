package chapter1.StrategyPattern.behavior.impl;

import chapter1.StrategyPattern.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I can't fly...");
		
	}

}
