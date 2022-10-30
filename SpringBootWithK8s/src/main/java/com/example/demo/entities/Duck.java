package com.example.demo.entities;

public class Duck extends Bird implements Fly, Swim {

	@Override
	public void canSwim() {
		System.out.print("Duck can swim");

	}

	@Override
	public void canFly() {
		System.out.println("Duck can fly");

	}
	
	@Override
	public void talks() {
		System.out.print("Quack, quack");
	}

}
