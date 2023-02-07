package com.perscholas.java_basics;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LessThanTen(); 
		//LessThanTenElseIf(); 
		//IfElseIf(); 
		//IfElse(); 
		//Grades(); 
		//Switch(); 
		Income(); 
	}
	
	
	public static void LessThanTen() { 
		
		int x = 7;
		
		if (x < 10 ) { 
			System.out.println(x); 
			x = 15; 
		}
		
		System.out.println("X after if statment: " + x); 
	}
	
	
	
	public static void LessThanTenElseIf() { 
		
		int x = 7; 
	
		for (int i = 0; i <= 2; i++) { 
			
			if (x<10) { 
				System.out.println("Less than 10");
			
			}
			else if (x > 10) { 
				System.out.println("Greater than 10 "); 
				
			}
			
			x= 15; 
			i++; 
		}
	
	}
	
	
	
	public static void IfElseIf() { 
		
		int x = 15; 
		
		for(int i = 0; i<= 2; i++) { 
			
			if (x< 10) { 
				System.out.println("x is less than 10");
				
			}
			else if (x > 10 && x < 20) { 
				System.out.println("X is between 10 and 20");
				
			}
			else if (x > 20) { 
				System.out.println(" X is greater than 20 ");
				
			}
			
			x = 50; 
			i++; 
		}
	}
	
	
	public static void IfElse() { 
		
		int x = 15; 
		
		for (int i=0; i <=2; i++) { 
			
			if (x < 10 || x > 20) { 
				System.out.println("Out of Range"); 
			}
			else { 
				System.out.println("In range");
			}
			
			x=5 ; 
			i++; 
			
		}
		
		
		
		
	}
	
	
	public static void Grades() { 
		
		Scanner scan = new Scanner(System.in); 
		int grade = scan.nextInt(); 
		scan.close(); 
		
		
		if (grade < 0 || grade > 100 ) { 
			System.out.print("Score is out of range");
		}
		else if(grade >= 90) { 
			System.out.print("Grade is an A");
		}
		else if(grade >= 80) { 
			System.out.print("Grade is an B");
		}
		else if(grade >= 70) { 
			System.out.print("Grade is an C");
		}
		else if(grade >= 60) { 
			System.out.print("Grade is an D");
		}
		else if(grade < 60 ) { 
			System.out.print("Grade is an F");
		}
		
	}
	
	
	public static void Switch() { 
		
		Scanner scan= new Scanner(System.in); 
		int input = scan.nextInt(); 
		scan.close(); 
		
		if (input <1 || input > 7) { 
			System.out.print("invaild number");
		}
		else { 
			
			switch(input) { 
				
				case 1: System.out.print("Its Sunday"); break; 
				case 2: System.out.print("Its Monday"); break;
				case 3: System.out.print("Its Tuesday"); break;
				case 4: System.out.print("Its Wednesday"); break;
				case 5: System.out.print("Its Thursday"); break;
				case 6: System.out.print("Its Friday"); break;
				case 7: System.out.print("Its Saturday"); break;
			}
		}
	} 
	
	
	public static void Income() {
		
		System.out.println("Please state your filling status:  \n"
				+ "\t 1: Single \n"
				+ " \t 2: Married Filling Jointy \n"
				+ "\t 3: Married Filling Separately \n"
				+ "\t 4: Head of House Hold"
		);
		
		Scanner scan = new Scanner(System.in); 
		int input = scan.nextInt(); 
		
		
		if (input < 1 || input > 4) {
			
			System.out.println("Please enter a vaild response");
			input = scan.nextInt(); 
			
			
		}
		
		
		else if (input == 1) {
			System.out.println("Please enter your income as a single number: ");
			int income = scan.nextInt(); 
			
			if (income < 0) { 
				System.out.println("Please enter a vaild income: ");
				income = scan.nextInt(); 
			}
			else if (income <= 8350) {
				System.out.println("Tax Rate is 10%");
				
			}
			else if (income <= 33950) {
				System.out.println("Tax Rate is 15%");
				
			}
			else if (income <= 82250) {
				System.out.println("Tax Rate is 25%");
				
			}
			else if (income <= 171550) {
				System.out.println("Tax Rate is 28%");
				
			}
			else if (income <= 372950) {
				System.out.println("Tax Rate is 33%");
				
			}
			else if (income >= 372951) {
				System.out.println("Tax Rate is 35%");
				
			}
			
			
		} 
		else if (input == 2) { 
			System.out.println("Please enter your income as a single number: ");
			int income = scan.nextInt(); 
			
			if (income < 0) { 
				System.out.println("Please enter a vaild income: ");
				income = scan.nextInt(); 
			}
			else if (income <= 16700) {
				System.out.println("Tax Rate is 10%");
				
			}
			else if (income <= 679000) {
				System.out.println("Tax Rate is 15%");
				
			}
			else if (income <= 137050) {
				System.out.println("Tax Rate is 25%");
				
			}
			else if (income <= 208850) {
				System.out.println("Tax Rate is 28%");
				
			}
			else if (income <= 372950) {
				System.out.println("Tax Rate is 33%");
				
			}
			else if (income >= 372951) {
				System.out.println("Tax Rate is 35%");
				
			}
			
		}
		else if(input == 3) { 
			System.out.println("Please enter your income as a single number: ");
			int income = scan.nextInt();
			
			if (income < 0) { 
				System.out.println("Please enter a vaild income: ");
				income = scan.nextInt(); 
			}
			else if (income <= 8350) {
				System.out.println("Tax Rate is 10%");
				
			}
			else if (income <= 33950) {
				System.out.println("Tax Rate is 15%");
				
			}
			else if (income <= 68525) {
				System.out.println("Tax Rate is 25%");
				
			}
			else if (income <= 104425) {
				System.out.println("Tax Rate is 28%");
				
			}
			else if (income <= 186475) {
				System.out.println("Tax Rate is 33%");
				
			}
			else if (income >= 186476) {
				System.out.println("Tax Rate is 35%");
				
			}
			
		}
		else if(input == 4) { 
			System.out.println("Please enter your income as a single number: ");
			int income = scan.nextInt();
			
			
			if (income < 0) { 
				System.out.println("Please enter a vaild income: ");
				income = scan.nextInt(); 
			}
			else if (income <= 11950) {
				System.out.println("Tax Rate is 10%");
				
			}
			else if (income <= 45500) {
				System.out.println("Tax Rate is 15%");
				
			}
			else if (income <= 117450) {
				System.out.println("Tax Rate is 25%");
				
			}
			else if (income <= 190200) {
				System.out.println("Tax Rate is 28%");
				
			}
			else if (income <= 372950) {
				System.out.println("Tax Rate is 33%");
				
			}
			else if (income >= 372951) {
				System.out.println("Tax Rate is 35%");
				
			}
			
		}
		
		scan.close(); 
		
		
	}

}
