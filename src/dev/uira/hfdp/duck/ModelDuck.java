package dev.uira.hfdp.duck;

import dev.uira.hfdp.duck.fly.FlyNoWay;
import dev.uira.hfdp.duck.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
