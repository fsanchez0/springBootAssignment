package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "fish")
public class Fish implements Swim{

	@Id
	@GeneratedValue
	private int record_number;
	private String name;
	private String behaviour;
	public int getRecord_number() {
		return record_number;
	}
	public void setRecord_number(int record_number) {
		this.record_number = record_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBehaviour() {
		return behaviour;
	}
	public void setBehaviour(String behaviour) {
		this.behaviour = behaviour;
	}
	@Override
	public void canSwim() {
		System.out.println("Fish Can swim");
	}
	
	
	
}
