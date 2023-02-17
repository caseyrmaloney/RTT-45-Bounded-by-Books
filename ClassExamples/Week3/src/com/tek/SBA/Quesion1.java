package com.tek.SBA;

import java.util.ArrayList;
import java.util.List;

public class Quesion1 {
	
	//string x = null; this means that no string objects has been created and there is no memory allocated 
	//string x = ""; this is an empty string that has been allocated to memory 

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// how to transfer an array into an array list
		String[] arr = { "one", "two", "three", "four", "five" };
		
		Quesion1 q1 = new Quesion1(); 
		q1.convert(arr); 
		
		q1.replace(2);// i have replaced two with the empty string  
		q1.replace(4); // i have replaced four with the empty string 
		
		List<String> compacted = q1.compact(); 
		//zero one three five 
		

	}
	
	//in the constructor create a new array list 
	private ArrayList<String> list; 
	
	 Quesion1() { 
		//in the construct create a new array list 
		
		
		
	}
	
	// know how to convert an array of strings to a list of strings 
	public void convert(String[] arr) {
		
		
		for (String str : arr) {
			list.add(str);
		}

		

	}
	
	
	//replacing in the array 
	//add a string in the array a 
	//replace the value 
	//in an array list write the value at idx to be an empty string 
	//print a message saying what the value of the position in the lsit is and the value you are overwriting it with 
	public void replace (int idx) { 
		
		System.out.println("The value of the ArrayList at position " + idx + "is " );
		list.set(idx, ""); 
		
	}
	
	public ArrayList<String > compact(){ 
		//remove all values in the array list that are empty strings 
		
		//list.removeAll("");
		return null; 
		
	}
	
	
	
	

}
