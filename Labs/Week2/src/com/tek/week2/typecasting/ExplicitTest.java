package com.tek.week2.typecasting;

public class ExplicitTest {
	
//	Output:
//		Double value 100.04
//		Long value 100
//		Int value 100
//
//		Conversion of int to byte.
//		i = 257 b = 1
//		Conversion of double to int.
//		d = 323.142 b = 323
//		Conversion of double to byte.
//		d = 323.142 b = 67
//

	
	public static void main(String[] args) {
	       double d = 100.04;
	       // explicit type casting
	       long l = (long)d;
	       int i = (int)l;
	       System.out.println("Double value "+d); // fractional part lost.
	       System.out.println("Long value "+l); // fractional part lost.
	       System.out.println("Int value "+i);

	byte b;
	int z = 257;
	double dou = 323.142;
	System.out.println("Conversion of int to byte.");
	b = (byte) z;
	System.out.println("i = " + z + " b = " + b);
	System.out.println("Conversion of double to int.");

	z = (int) dou;
	System.out.println("d = " + dou + " b = " + z);
	System.out.println("Conversion of double to byte.");

	b = (byte) dou;
	System.out.println("d = " + dou + " b = " + b);

	   }


}
