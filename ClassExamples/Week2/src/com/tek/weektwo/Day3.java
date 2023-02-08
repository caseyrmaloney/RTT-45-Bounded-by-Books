package com.tek.weektwo;

import java.util.*;

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
		
		
		List<String> list = new ArrayList<>(); 
		list.add("String 1"); 
		list.add("String 2");
		list.add("String 3"); 
		
		
		//used for when you need to know the position 
		for(int position = 0; position< list.size(); position++) { 
			System.out.println(list.get(position));
		}
		
		//short hand for for list 
		//for each element in the list do something 
		for (String element : list  ) { 
			
			System.out.println(element);
			
		}
		
		/
		
		System.out.println();
		List<Integer> ints = new ArrayList<Integer>(); 
		
		
		//example of autoboxing 
		
		for ( int i = 1; i<= 10; i++) { 
			ints.add(i); 
		}
		
		for (Integer element : ints){ 
			System.out.println(element);
		}
		
		
		
		
		System.out.println();
		
		for (Integer element : ints) { 
			System.out.print(element + " "); 
		}
		
		
		
		

	}

}
