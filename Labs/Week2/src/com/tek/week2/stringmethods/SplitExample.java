package com.tek.week2.stringmethods;

//importing Arrays to convert array to string
//used for printing arrays
import java.util.Arrays; 



public class SplitExample {
	
//	The split() method divides the string at the specified regex and returns an array of substrings. Syntax of the string split() method is:
//		string.split(String regex, int limit)
	
	
	public static void main(String[] args) {
	    String vowels = "a::b::c::d:e";

	    // splitting the string at "::"
	    // storing the result in an array of strings
	    String[] result = vowels.split("::");

	    // converting array to string and printing it
	    System.out.println("result = " + Arrays.toString(result));
	  }
	
//	result = [a, b, c, d:e]
//			Here, we split the string at ::  Since the limit parameter is not passed, the returned array contains all the substrings.
//
// 
//

}
