package dev.uira.hfdp.duck;

import dev.uira.hfdp.duck.fly.FlyWithWings;
import dev.uira.hfdp.duck.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}

}
