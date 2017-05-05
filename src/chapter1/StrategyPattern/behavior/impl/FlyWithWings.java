package chapter1.StrategyPattern.behavior.impl;

import chapter1.StrategyPattern.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("I'm flying with wings!!");
	}
}
