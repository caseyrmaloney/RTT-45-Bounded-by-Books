package com.tek.week3.libapp;

public class LibraryInterfaceDemo {
	
	
	public static void main(String[] args) { 
		
		
		KidUsers kid= new KidUsers(); 
	
		AdultUsers adult = new AdultUsers(); 
	
		
		kid.registerAccount(10);
		kid.registerAccount(18);
		kid.requestBook("Kids");
		kid.requestBook("Fiction");
		
		adult.registerAccount(5); 
		adult.registerAccount(23);
		adult.requestBook("Kids");
		adult.requestBook("Fiction");
		
		
	}

}
