package chapter1.StrategyPattern.duck;

import chapter1.StrategyPattern.behavior.FlyBehavior;
import chapter1.StrategyPattern.behavior.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){}
	
	public abstract void display();
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
