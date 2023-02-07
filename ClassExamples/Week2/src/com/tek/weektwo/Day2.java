package com.tek.weektwo;

public class Day2 {
	
	public static void main(String [] args ) { 
		
		autobox(); 
		
	}
	
	
	public static void autobox() { 
		
		//autoboxing vs unboxing 
		// autobox into the interger
		// a is a primative a does not have any functions on it 
		int a = 50; 
				
		//wrapper class does have function 
		Integer i = a;
				
		i.doubleValue(); 
		i.longValue(); 
		
		// wrapper call allows you to set it to null which means it has not value 
		//this can nt be done with a primitive a = null; will not compile 
		
		Integer n = null; 
		if (n == null) { 
			//do some code 
		}
		
	}
	
	
	
	public static void Character() { 
		
		//primitve can not call function on 
		char d = 'D'; 
		
		
		//using a wrapper 
		Character c = 'C'; 
		System.out.println(c.toLowerCase('Z'));
		
		
		
		
		
	}

}
