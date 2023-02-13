package com.tek.week3;


//Super Class 
public class Monster {

	
	//method attack()
	
	

	String attack; 
	
	
	
	public Monster (String string) { 
		super(); 
	}
	
	
	public void SetAttack(String attack) { 
		System.out.println(attack); 
		
		this.attack= attack; 
	}
	
	public String attack() { 
		
		String newMonster = "!^_&^$@+%$* I don't know how to attack!"; 
		
		return newMonster; 
	}
	
	
	
}
