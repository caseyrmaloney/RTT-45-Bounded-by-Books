package com.perscholas.java_basics;

//assignment 302.1.2 

public class JavaBasics {
	
	public static void main (String[] args) { 
		
	
		addInteger(); 
		
		addDouble(); 
	
		addIntDouble(); 
	 
		dividInts();
		
		dividDoubles(); 
		
		intsXY(); 
		
		constantCalc(); 
		
		cafe(); 
		

		
		
		
	}
	
	
	/* 
	 * Write a program that declares 2 integer variables, assigns an integer to each, and adds them together.
	 *  Assign the sum to a variable. Print out the result
	 */
	
	
	public static void addInteger () { 
		
		int i = 3;
		int j = 2; 
		
		int k = i + j; 
		System.out.println("Int variables i + j = " + k + "\n" ); 
		
	}
	
	/* 
	 * Write a program that declares 2 double variables, assigns a number to each, and adds them together.
	 *  Assign the sum to a variable. Print out the result
	 */
	
	
	public static void addDouble () { 
		
		double i = 3.3;
		double j = 2.2; 
		
		double k = i + j; 
		System.out.println("Double variables i + j = " + k + "\n" ); 
		
	}
	
	
	/* 
	 * Write a program that declares an integer variable and a double variable, assigns numbers to each, and adds them together. Assign the sum to a variable.
	 *  Print out the result. What variable type must the sum be?
	 */
	
	public static void addIntDouble () { 
		
		int i = 1; 
		double j = 3.2; 
		
		double k = i + j; 
		
		System.out.println("Adding an int j and double j = " + k + "\n" );
	}
	
	
	/* 
	 * Write a program that declares 2 integer variables, assigns an integer to each, and divides the larger number by the smaller number.
	 *  Assign the result to a variable. Print out the result. Now change the larger number to a decimal. What happens? What corrections are needed?

	 */
	
	public static void dividInts () { 
		
		int i = 25; 
		int j = 5; 
		
		int k = i/j; 
		
		System.out.println("Int i divdied by int j = " + k);
		
		
		//casting j to a now double 
		j = (int) 5.2; 
		
		//assigning new double variable 
		double l = i / j; 
		
		System.out.println("Int i divdied by int j with a type cast = " + l + "\n" );
		
		
	}
	
	/* 
	 * Write a program that declares 2 double variables, assigns a number to each, and divides the larger by the smaller. Assign the result to a variable.
	 *  Print out the result. Now, cast the result to an integer. Print out the result again.
	 */
	
	
	public static void dividDoubles() { 
		
		double i = 30.5 ; 
		double j = 5.5; 
		
		double k = i/j;

		System.out.println("Int i divdied by int j = " + k);
		
	
		
		System.out.println("Type casting result = " + (int)k  +  "\n" ); 
		
		
	}
	
	
	/* 
	 * Write a program that declares two integer variables, x, and y, and assigns 5 to x and 6 to y.
	 *  Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
	 */
	
	public static void intsXY() { 
		
		int x = 5; 
		int y = 6; 
		
		double q = y/x ;
		
		System.out.println("Value of q =  " + q );
		
		//casting y to double and assigning it to q 
		
	
		
		q = (double)y; 
		
		
		System.out.println("Double q value = " + q +  "\n" );
		
		
	}
	
	
	
	
	/*
	 * Write a program that declares a named constant and uses it in a calculation. Print the result.
	 */
	
	
	static void constantCalc() { 
		
		final int CONSTANT_INT = 10; 
		
		int j = 6; 
		

		System.out.println("Addition: " + (CONSTANT_INT + j) );
		System.out.println("Subtraction: " + (CONSTANT_INT - j) );
		System.out.println("Multiplication: " + (CONSTANT_INT * j) );
		System.out.println("Divison: " + (CONSTANT_INT / j) + "\n" );
		
		
		
	}
	
	/*
	 * Write a program where you create 3 variables that represent products at a cafe. 
	 * The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
	 *  Assign prices to each product. Create 2 more variables called subtotal and totalSale and complete an “order” for 3 items of the first product, 
	 *  4 items of the second product, and 2 items of the third product. Add them all together to calculate the subtotal. Create a constant called SALES_TAX 
	 *  and add sales tax to the subtotal to obtain the totalSale amount. 
	 * Be sure to format the results to 2 decimal places.
	 */
	
	
	static void cafe() { 
		
		double coffee= 2.35;
		double latte = 4.35; 
		double espresso = 3.32; 
		
		double subtotal; 
		double totalSale; 
		
		final double SALES_TAX = 2.90; 
		
		double order1= coffee + latte + espresso; 
		double order2 = (coffee * 2) + latte + espresso; 
		double order3 = latte + coffee; 
		
		subtotal= order1 + order2 + order3; 
		
		
		totalSale = subtotal + SALES_TAX; 
		
		System.out.println("Total sale total comes to: " + totalSale + "\n"); 
		
		
	}

}
