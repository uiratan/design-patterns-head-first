package dev.uira.hfdp.duck.fly;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I'm flying with a rocket!");
	}

}
