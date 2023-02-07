package com.tek.week2.stringmethods;

public class CompareToExample {
	
// The Java String compareTo() method compares the given string with the current string. It is a method of ‘Comparable’ interface that is implemented by the String class. It either returns a positive number, negative number or 0. For example
	
	public static void main(String args[]){
		String s1="hello";
		String s2="hello";
		String s3="hemlo";
		String s4="flag";
		System.out.println(s1.compareTo(s2)); // 0 because both are equal
		System.out.println(s1.compareTo(s3)); //-1 because "l" is only one time lower than "m"
		System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
		
	}
	
	
//	if s1 > s2, it returns a positive number.
//	if s1 < s2, it returns a negative number.
//	if s1 == s2, it returns 0

	

}
