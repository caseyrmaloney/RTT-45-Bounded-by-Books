package com.tek.ArrayLibraryPratice;

public class ArrayLibraryMain {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ArrayLibrary al = new ArrayLibrary();

		int[] numbers = new int[10];
		
		int[] nums =  {3, 5, 2, 8, 4, 9, 1}; 

		// 1- initialize the array with numbers from1 - 10
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		// 2- create a function that will insert a number into the at a position

		al.printArray(numbers, "Default Initiallized");

		numbers = al.insertElement(numbers, 5, 11);
		
		al.printArray(numbers, "After element inseert: ");
		
		
		try { 
			numbers= al.insertElement(numbers, 30, 11); 
		}
		catch (Exception e) { 
			System.out.println("an exception occured");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		numbers= al.append(numbers, 12); 
		al.printArray(numbers, "After append:    ");
		
		//numbers = al.append(numbers, 12); 
		
		numbers = al.delete(numbers, 3); 
		al.printArray(numbers, "After deleted element");
		
		int position = al.findPosOfValue(numbers,3); 
		System.out.println("The position of value 3 is: " + position);
		
		
		al.printArray(numbers, "The original array: " );
		
		
		int[] sort= al.bubbleSort(numbers);
		al.printArray(sort, "The Sorted array:  ");
		
		

	}

}
