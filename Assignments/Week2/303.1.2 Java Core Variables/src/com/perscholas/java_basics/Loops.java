package com.perscholas.java_basics;

import java.util.*; 

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MultiplicationTable(); 
		//GCD(); 
		Tuition(); 
		
	}
	
	
	public static void MultiplicationTable() { 
		
		//nested for loops to print the multiplication table 
		
		
		//rows 
		for(int i=1; i<13; i++) { 
			//columns 
			for (int j= 1; j < 13; j++) { 
				
				System.out.print(" " + i * j + " " );
				
			}
			//new row line 
			System.out.println(); 
		}
		
	}
	
	
	
	public static void GCD() {
		
		//prompts users to enter two positive numbers 
		
		Scanner scan= new Scanner(System.in); 
		
		System.out.println("Lets find the GCD of two numbers!");
		System.out.println("Please enter your first postiive number");
		int num1 = scan.nextInt(); 
		
		
		//checking if num1 is a positive number 
		if (num1 < 0) { 
			System.out.println("Please enter a positive number");
			num1= scan.nextInt(); 
		}
		
		System.out.println("Please enter your second postiive number");
		int num2= scan.nextInt(); 
		
		
		//checking if num2 is a positive number 
		if (num2 < 0) { 
			System.out.println("Please enter a positive number");
			num2= scan.nextInt(); 
		}
		
		
		scan.close(); 
		
		// check whether k is a common divisor for n1 and n2 
		// k is greater than n1 or n2 
		
		//based gcd 
		int gcd = 1; 
		
		//based counter 
		int k = 1; 
		
		
		//k can not be bigger than num1 or num2 
		while (k <= num1 || k <= num2) { 
			
			if (num1 % k == 0 && num2 % k == 0) { 
				
				//gcd is now what k is at 
				gcd = k;
				
			}
			
			//increment k 
			k++; 
			
		}
		
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd); 
		
	}
	
	
	public static void Tuition() {
		
		double tuition= 10000.0; 
		double increase = 1.07; 
		
		int years = 0; 
		
		
		while (tuition < 20000.0) { 
			
			tuition *= increase; 
			years++; 
		}
		
		System.out.print("The tuition will be double in " + years + " years");
		
	} 
	
	

}
