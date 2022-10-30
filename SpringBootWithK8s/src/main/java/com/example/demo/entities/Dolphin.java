package com.example.demo.entities;

public class Dolphin implements Animal, Swim{

	@Override
	public void canSwim() {
		
		System.out.println("Dolphins can swim");
	}

	@Override
	public void talks() {
		
		System.out.println("Dolphins can talk");
	}

}
