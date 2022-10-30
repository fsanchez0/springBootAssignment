package com.example.demo.entities;

public class Rooster extends Bird implements Walk{

	@Override
	public void canWalk() {
		System.out.println("Rooster can walk");
	}
	
	@Override
   public void talks() {
	   System.out.println("Rooster can talk");
   }
	
}
