package chapter1.StrategyPattern.behavior.impl;

import chapter1.StrategyPattern.behavior.QuackBehavior;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}
