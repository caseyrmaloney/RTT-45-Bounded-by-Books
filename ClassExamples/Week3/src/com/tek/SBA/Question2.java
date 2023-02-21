package com.tek.SBA;

import java.util.Arrays;

public class Question2 {
	
	//0 based array and 1 based array 
	//arrays are 0 based - however the requirments are 1 based 
	//ignore the 0 element of he array 
	
	//position	: 0 1 2 3 4 5 
	//values	: a b c d e f
	
	//give you a number for a size into a constant 
	private static final int ARRAY_SIZE =5; 
	int [] array = {1,2,3,4,5,6}; 
	int [] arr; 
	
	public static void main(String [] args ) { 
		
		Question2 q2 = new Question2(); 
		
		
		
		
		int[] avg= {1,2,3,4,5,6}; 
		
		calculateAverage(avg); 
		
		System.out.println("================================");
		
		q2.setValue(4); //value is -1 need to change 
		q2.setValue(5); //print the first message setting value 
		q2.setValue(4); //print 2nd message because it already been changed 
		
		
		System.out.println("================================");
		q2.move(50, 3); //value is -1 so
		q2.move(40, 3); //value is then changed and moved 
		q2.move(20, 4); //value is 1 from previous code so its set to 
		
	}
	
	Question2(){ 
		
		//need to make a one based data structure for an array of size 5 
				//an array is 0 based so when we need an array 5 elements they go to 0-4 
				//however since we are one based we need 5 elements 1-5 - size of the array is size 6 
				//ignore the 0th element of the array 
				
				arr = new int[ARRAY_SIZE+1];
				
				//initialize this entire array to a value......-1 can us Arrays.fill(this.arr, 1)
				Arrays.fill(this.arr, -1);
				
				System.out.println("A new array has been created");
		
	}
	
	public static void calculateAverage(int [] arr) { 
		//add all the elements and then divide by the total number of elements 
		//print out a message using system.out format of the average with 
		//decimal format this using %.2f 2 places to the right 
		//include a new line character at the end of the message 
		
		double total = 0;  
		
		for (int i : arr) {
			total += (double)i; 
		}
		
		
		double avg = (total / (double)arr.length); 
		
		System.out.printf("Average: %.2f \n", avg); 
		
	}
	
	
	public void setValue(int value) { 
		//if the value at array[index] is == -1 then print a message saying that you set the value  to 1 
		//otherwise print a message saying that it was already changed 
		
		if (arr [value] == -1) { 
			arr[value] = 1; 
			System.out.println("Index " + value + " value is set to 1");
		}
		else { 
			System.out.println("Index " + value + " value is already set");
		}
	}
	
	public void move (int value, int id) { 
		//if the value at array[id] != 1 then change the value to 1 ???? 
		//if the value at array[id] == 1 then print a message saying "value with id: {id} is moved to {value}" 
		//otherwise print a message saying "value us already -1" 

		if(array[id] != 1) { 
			array[id] = 1; 
			System.out.println("the value is set to 1"); 
		}
		else if (array[id] == 1 ) { 
			System.out.println("value with id: " + id + " is move to " + value);
		}
		
		
		
		
	}
	

}
