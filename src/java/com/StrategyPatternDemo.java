package com;
import com.Behavior.impl.flyBehavior.FlyNoWay;
import com.Behavior.impl.quackBehavior.Quack;
import com.Behavior.impl.quackBehavior.Squeak;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck donaldDuck = new MallardDuck();
		donaldDuck.performFly();
		donaldDuck.performQuack();
		
		//dynamically set another behavior
		donaldDuck.setFb(new FlyNoWay());
		donaldDuck.setQb(new Squeak());
		
		donaldDuck.performFly();
		donaldDuck.performQuack();
		
	}

}
