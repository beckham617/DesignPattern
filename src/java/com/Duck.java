package com;
import com.Behavior.FlyBehavior;
import com.Behavior.QuackBehavior;

public abstract class Duck {
	

	FlyBehavior fb;
	QuackBehavior qb;
	
	public Duck() {
	}
	
	public abstract void display();
	
	public void performQuack() {
		qb.quack();
	}
	
	public void performFly() {
		fb.fly();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	
	
	
	
	public FlyBehavior getFb() {
		return fb;
	}

	public void setFb(FlyBehavior fb) {
		this.fb = fb;
	}

	public QuackBehavior getQb() {
		return qb;
	}

	public void setQb(QuackBehavior qb) {
		this.qb = qb;
	}
	
	
}
