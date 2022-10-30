package com.example.demo.entities;

public class Parrot extends Bird{
	private String roomies;

	@Override
	public void talks() {
		if(this.roomies.equalsIgnoreCase("dogs"))
			System.out.print("Woof, woof");
		else if(this.roomies.equalsIgnoreCase("cats"))
			System.out.print("Meow");
		else if(this.roomies.equalsIgnoreCase("rooster"))
			System.out.print("Cock-a-doodle-doo");
		else
			System.out.println("Parrot can talk");
	}

	public String getRoomies() {
		return roomies;
	}

	public void setRoomie(String roomies) {
		this.roomies = roomies;
	}
}
