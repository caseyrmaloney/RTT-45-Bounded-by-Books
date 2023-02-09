package com.perscholas.java_basics;

import java.util.*;
import java.io.*;


public class Arrays {
	
	public static void main(String[] args) { 
		
//		Array(); 
//		MiddleEle(); 
		//Colors(); 
		//ArrayIndex(); 
		//InsertArray(); 
		//ByTwo();
		//MiddleElement(); 
		//Swap(); 
		//Ascending (); 
		//ArrayWithDifypes(); 
		Fave(); 
		
	}
	
	public static void Array() {
		
		int[] nums= {1, 2, 3} ;
		
		for (Integer element: nums) { 
			System.out.println(element); 
		}
	}
	
	
	public static void MiddleEle() { 
		
		int[] nums = {13, 5, 7, 68, 2};
		
		if(nums.length % 2 == 0) { 
			
			//if its a even length array 
			
			//right hand 
			int a = nums[(nums.length/2)-1]; 
			//left hand number 
			int b = nums[nums.length/2]; 
			
			System.out.println("The middle numbers are: " + a + " and " + b);
		}else { 
			
			// if the array is odd 
			
			int i = nums[nums.length/2]; 
			
			System.out.print("The middle number is: " + i);
			
		}
		
	
		
		
	}
	
	
	public static void Colors() { 
		
		String[] colors = {"red", "green", "blue", "yellow"}; 
		
		System.out.println(colors.length);
		
		//clone method 
		String[] colors2 = colors.clone(); 
		
		for (String elements : colors2) { 
			System.out.println(elements);
		}
		
	
		
	}
	
	
	
	public static void ArrayIndex() { 
		
		int[] nums = {1, 2, 3, 4, 5};
		
		System.out.println(nums[0]); 
		
		System.out.println(nums[nums.length-1]);
		
		//trying to print nums.length
		//System.out.println(nums[nums.length]); 
		
//		Exception in thread "main" 5
//		java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//			at Assignments/com.perscholas.java_basics.Arrays.ArrayIndex(Arrays.java:85)
//			at Assignments/com.perscholas.java_basics.Arrays.main(Arrays.java:13)

	
		
	}
	
	
	public static void InsertArray() { 
		
		 int[] nums = { 1, 2, 3, 4,5} ; 
		 
		 
		 for (int elements : nums) { 
				System.out.println(elements);
			}
		 
	      
		 
	      
	}
	
	public static void ByTwo() { 
		
		int[] nums = { 1, 2, 3, 4,5} ; 
		
		System.out.println("Original Array: ") ;
		for (int elements : nums) { 
			System.out.println(elements);
		}
		
		
		for (int i=0; i < nums.length; i++) { 
			nums[i]= nums[i] * 2; 
			
		}
		System.out.println("New Array muliple by 2: ") ;
		for (int elements : nums) { 
			System.out.println(elements);
		}
		
		
	}
	
	
	public static void MiddleElement() { 
		
		 int[] nums = { 1, 2, 3, 4,5} ; 
		 
		 
		 
		 for ( int i = 0; i< nums.length; i++) { 
			 if (i == 2 ) { 
				 continue; 
			 }
			 
			 System.out.println(nums[i]);
		 }
		
	}
	
	
	
	public static void Swap() { 
		
		String[] arr = {"hello", "this", "is", "my", "array"}; 
		
		System.out.println("Original Array: ") ;
		for (String elements : arr) { 
			System.out.println(elements);
		}
		
		String temp; 
		String temp2= arr[0]; 
		
		if (arr.length % 2 == 1 ) {
			
			temp = arr[arr.length/2];
			arr[arr.length/2] = temp2; 
			arr[0]= temp; 
			
		}
		else { 
			temp = arr[(arr.length/2)-1];
			arr[(arr.length/2)-1] = temp2; 
			arr[0]= temp; 
			
		}
		
		System.out.println("Swaped Elements 0 and 2: ") ;
		for (String elements : arr) { 
			System.out.println(elements);
		}
	}
	
	
	
	public static void Ascending () { 
		
		int[] arr= {4, 2, 9, 13, 1};
		
		System.out.println(" Array before sorting: "); 
		for (int elements : arr) { 
			System.out.println(elements);
		}
		
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i+1; j< arr.length; j++) { 
				
				int temp =0; 
				if (arr [i]> arr[j]) { 
					temp = arr[i]; 
					arr[i]= arr[j]; 
					arr[j]= temp; 
				}
			}
			
			
		}
		System.out.println(" Array after sorting: "); 
		for (int elements : arr) { 
			System.out.println(elements);
		}
		
		
	}
	
	
	public static void ArrayWithDifypes() {
		
		Object[] arr = new Object[5]; 
		
		arr[0]= Integer.valueOf(2); 
		arr[1]= "String1"; 
		arr[2]= "String2"; 
		arr[3]= "String3"; 
		arr[4]= Double.valueOf(2.3); 
		
		for (Object elements: arr ) { 
			System.out.println(elements); 
		}
		
		
		
	}
	
	public static void Fave() { 
		Scanner scan = new Scanner(System.in); 
		
		
		//length of the array - user input 
		int favoriteNum; 
		
		System.out.println("How many favorite things do you have?"); 
		
		
		favoriteNum= scan.nextInt(); 
		
		
		//array things length of the number they input 
		String[] things = new String[favoriteNum];
		
		
		//element what user inputs 
		String element; 
		
		//looping to input multiple inputs from user
		
		//next line was giving weird problems idk 
		for ( int i = 0; i < things.length; i++) { 
			System.out.println("Enter your thing: ");
			element=scan.next(); 
			
			
			//array (things) enter the element that user input in the index 
			things[i]= element; 
			
		}
		//looping through the array 
		System.out.println("your favorite things are; "); 
		for (String elements: things) { 
			System.out.println(elements); 
		}
		
		
		scan.close(); 
	}

	
	
	
	

}
