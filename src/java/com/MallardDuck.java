package com;

import org.junit.jupiter.api.Test;

import com.Behavior.impl.flyBehavior.FlyWithWings;
import com.Behavior.impl.quackBehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		qb = new Quack();
		fb = new FlyWithWings();
	}
	
	@Test
	public void display(){
		System.out.println("I'm a MallardDuck");
	}
}
