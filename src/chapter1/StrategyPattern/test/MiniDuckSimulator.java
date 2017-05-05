package chapter1.StrategyPattern.test;

import chapter1.StrategyPattern.behavior.impl.FlyRocketPowered;
import chapter1.StrategyPattern.duck.Duck;
import chapter1.StrategyPattern.duck.MallardDuck;
import chapter1.StrategyPattern.duck.ModelDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
