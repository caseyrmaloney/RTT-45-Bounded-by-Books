package com.tek.week1.operators;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LeftShift(); 
		RightShift(); 
	}
	
	
	public static void LeftShift() { 
		
		int x =2; 
		
		//10 
		System.out.println(Integer.toBinaryString(x));
		//4 
		System.out.println(x << 1); 
		
		x = 9; 
		//1001
		System.out.println(Integer.toBinaryString(x));
		//18
		System.out.println(x << 1); 
		
		x = 17; 
		//10001
		System.out.println(Integer.toBinaryString(x));
		//34
		System.out.println(x << 1); 
		
		x = 88; 
		//1011000
		System.out.println(Integer.toBinaryString(x));
		//176
		System.out.println(x << 1); 
		
	}
	
	
	public static void RightShift() { 
		
		int x = 150; 
		
		//10010110
		System.out.println(Integer.toBinaryString(x));
		//37
		System.out.println(x >> 2); 
		
		x = 225; 
		//11100001
		System.out.println(Integer.toBinaryString(x));
		//56
		System.out.println(x >> 2); 
		
		x = 1555; 
		//11000010011
		System.out.println(Integer.toBinaryString(x));
		//388
		System.out.println(x >> 2); 
		
		x = 32456; 
		//111111011001000
		System.out.println(Integer.toBinaryString(x));
		//8114
		System.out.println(x >> 2); 
		
	}
	
	public static void Bitwise() { 
		
		int x =7; 
		int y = 17; 
		
	}
	
	
	
	

}
