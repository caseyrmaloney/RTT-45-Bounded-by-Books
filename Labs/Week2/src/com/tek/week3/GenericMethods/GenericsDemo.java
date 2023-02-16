package com.tek.week3.GenericMethods;

public class GenericsDemo {
	
	

	  // create a generics method
	  //type parameter <T> is inserted after the public modifier and before the return type void 
	//call the generics method by placing the actual type <String> and <Integer> inside the brackets before the method name
	  public <T> void genericsMethod(T data) {
	    System.out.println("Generics Method:");
	    System.out.println("Data Passed: " + data);
	  }

	  
	  public static void main(String[] args) {
		// initialize the class with Integer data
		    GenericsDemo dObj = new GenericsDemo();
		   dObj.genericsMethod(25); // passing int
		   dObj.genericsMethod("Per Scholas"); // passing String
		   dObj.genericsMethod(2563.5); // passing float
		    dObj.genericsMethod('H'); // passing Char
		 }

	
	  
	  
	

}
