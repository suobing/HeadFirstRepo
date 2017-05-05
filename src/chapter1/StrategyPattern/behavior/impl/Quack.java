package chapter1.StrategyPattern.behavior.impl;

import chapter1.StrategyPattern.behavior.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack!");
	}

}
