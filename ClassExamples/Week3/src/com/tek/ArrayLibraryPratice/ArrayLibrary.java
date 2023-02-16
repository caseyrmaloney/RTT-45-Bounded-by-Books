package com.tek.ArrayLibraryPratice;

import java.util.Arrays;

public class ArrayLibrary {

	// PRINT ARRAY FUNCTION

	public void printArray(int[] arr, String message) {

		System.out.println(message + " \t= " + Arrays.toString(arr));
	}

	// INSERT ELEMENT FUNCTION

	public int[] insertElement(int[] arr, int position, int value) throws Exception{

//		// 1- create a new array that is one larger than the size of array
//		int[] copy = new int[arr.length + 1];
//
//		// 2- copy all elements from arr into the new copy
//		for (int i = 0; i < arr.length; i++) {
//			copy[i] = arr[i];
//
//		}
		
		
		if (position < 0) { 
			throw new Exception("Position must be greater than 0"); 
		}
		// refactoring from the code above using the append method
		
		
		int[] copy = append(arr, 0);

		printArray(copy, "Copy initialized to: ");

		// 3- move all elements in the arr starting at position to the end 1 space to
		// the right
		// arr[i+1] = array [i]
		for (int i = position; i < arr.length; i++) {
			copy[i + 1] = arr[i];

		}

		// printArray(copy, "Copy to right ");

		// 4- set arr[position] = number

		copy[position] = value;
		// printArray(copy, "new value set to: ");

		return copy;

	}

	// APPEND METHOD
	public int[] append(int[] numbers, int value) {
		// TODO Auto-generated method stub

		int[] copy = new int[numbers.length + 1];

		for (int i = 0; i < numbers.length; i++) {
			copy[i] = i + 1;

		}
		// use the for loop instead of get understand of loops
		// copy = Arrays.copyOf(numbers, numbers.length+1);

		printArray(copy, "Copied Arr:        ");

		copy[copy.length - 1] = value;

		return copy;
	}

	// DELETE METHOD
	public int[] delete(int[] numbers, int position) {

		// int [] copy = new int[numbers.length-1];

		// my code
//		for (int i = 0, k =0; i< numbers.length; i++) { 
////			
////			if(i != position) { 
////				copy[k]= numbers[i]; 
////				k++; 
////			}
//			
//			if (i == position) { 
//				continue; 
//			}
//			else { 
//				copy[k]= numbers[i]; 
//				k++;
//			}
//		}
		// eric example

		// starting at position to the end of arr shift everything left
		for (int i = position + 1; i < numbers.length; i++) {
			numbers[i - 1] = numbers[i];
		}

		// 2- make a new arr of size 1 smaller
		int[] copy = new int[numbers.length - 1];

		// 3- copy arr into your copy array minus the last element

		for (int i = 0; i < copy.length; i++) {
			copy[i] = numbers[i];

		}

		return copy;
	}

	public int findPosOfValue(int[] arr, int value) {
		// TODO Auto-generated method stub

		// find the position of the incoming value
		// if the value is not found return -1;
		
		int position = -1; 

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value ) { 
				position = i; 
				break; 
				
			}
			
		}
		return position; 
		
		
	}
	
	public int[] bubbleSort(int[] arr) { 
		//1- outer loop to move cross the entire array 
		//2- inner loop move across the entire array 
		//3- compare elements at inner and outer arr[inner] and [arr[inner+1] ]
		//if arr[inner] < arr[inner+1]swap the element 
		//5- use a temp varaible to store one value 
		//6- move the other value 
		//7- put the temp value into the one you just moved 
		//8- return the array 
		
		int temp =0 ; 
		
		//outer loop 
		for(int outer=0; outer<arr.length; outer++) { 
			for(int inner= 0; inner < arr.length-1; inner++) { 
				
				if (arr[inner] < arr[inner+1]) { 
					
					//swap the elements 
					temp = arr[inner]; 
					arr[inner]= arr[inner +1]; 
					arr[inner +1 ] = temp; 
				}
				
			}
		}
		
		return arr; 
	}


}
