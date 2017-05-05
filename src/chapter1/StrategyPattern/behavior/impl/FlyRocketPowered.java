package chapter1.StrategyPattern.behavior.impl;

import chapter1.StrategyPattern.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior{
	public void fly(){
		System.out.println("fly with rocket!");
	}
}
