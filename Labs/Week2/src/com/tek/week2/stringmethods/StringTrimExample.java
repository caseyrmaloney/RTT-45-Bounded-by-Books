package com.tek.week2.stringmethods;

public class StringTrimExample {
	
	// The Java string trim() method removes the leading and trailing spaces. It checks the Unicode value of the space character (‘\u0020’) before and after the string. If it exists, then remove the spaces and return the omitted string
	
	public static void main(String args[]){ 
		String s1="  hello   "; 
		System.out.println(s1+"how are you");        // without trim() 
		System.out.println(s1.trim()+"how are you"); // with trim() 
		 } 
	
	// output: hello how are you 

}
