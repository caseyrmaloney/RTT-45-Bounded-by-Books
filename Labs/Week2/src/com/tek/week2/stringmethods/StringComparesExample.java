package com.tek.week2.stringmethods;

public class StringComparesExample {
	
	
//	We can compare String in Java based on content and reference.
//	It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
//	There are three ways to compare String in Java:
//	By Using equals() Method
//	By Using == Operator
//	By compareTo() Method

	
	public static void main(String[] args) { 
		
		EqualsMethod(); 
		Operators(); 
		CompareToMethod(); 
		
		
		
		
	}
	
	
	// using equal method 
	
//	String class equals() method compares the original content of the string. It compares values of string for equality.
	
	
	public static void EqualsMethod() { 
		String s1="PerScholas";
	       String s2="PerScholas";
	       String s3=new String("PerScholas");
	       String s4="Teksystem";
	       System.out.println(s1.equals(s2));//true
	       System.out.println(s1.equals(s3));//true 
	       System.out.println(s1.equals(s4));//false

	}
	
	
	// By Using == operator: The == operator compares references, not values 
	public static void Operators() { 
		
		 String s1="Perscholas";
	       String s2="Perscholas";
	       String s3=new String("Perscholas");
	       System.out.println(s1==s2);//true (because both refer to same instance)
	       System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
	   }
	
	
	// using the compare to method 
	
	// The String class compareTo() method compares values lexicographically. It returns an integer value that describes if the first string is less than, equal to, or greater than the second string.
	// return 0 if this string is the same as another;
	// <0 if lexicographically less than another; or >0
	


//Suppose s1 and s2 are two String objects. If:
//s1 == s2 : The method returns 0.
//s1 > s2 : The method returns a positive value.
//s1 < s2 : The method returns a negative value.
	
	public static void CompareToMethod() { 
		
		String s1="Perscholas";
	       String s2="Perscholas";
	       String s3="Perscholas";
	       System.out.println(s1.compareTo(s2));//0
	       System.out.println(s1.compareTo(s3));//1(because s1>s3)
	       System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )
	       
	       
		
	}


	
	
	
	
	
}
