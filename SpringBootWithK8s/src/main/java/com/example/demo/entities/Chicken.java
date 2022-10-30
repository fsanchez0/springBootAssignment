package com.example.demo.entities;

public class Chicken extends Bird implements Walk{

	@Override
	public void canWalk() {
		System.out.println("Chicken can walk");
	}
	
	public void talks() {
		System.out.print("Cluck, cluck");
	}

}
