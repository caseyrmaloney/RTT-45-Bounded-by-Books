package com.tek.weektwo;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//print 10 to 30 showing even nums only and using continue 
		for (int i = 10; i < 31; i++) {
			
			//if it an odd number continue the loop but dont print the odd nums
			if (i%2 == 1) { 
				continue; 
				
			}
			System.out.print(i + "  ");
		}
		
		
		
		System.out.println();
		//from 10 to 1 showing all numbers 
		for (int i = 10; i> 0; i--) { 
			System.out.print(i+  " ");
		}
		
		
		System.out.println();
		// from 10 to 30 and break when you find the fist number divisbale to 3 
		
		int a = 10; 
		while (a <= 30) { 
			if (a % 3 == 0) { 
				System.out.print(a +  " " );
				break;
				
			} a++; 
			
			
		}

	}

}
