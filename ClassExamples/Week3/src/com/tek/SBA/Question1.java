package com.tek.SBA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 {

	// String x = null;// this means no string object has been created in mem
	// String y = "";// this is an empty string and has a spot in mem

	// ( x == null ) is true
	// ( x.equals("") ) will throw a NullPointerException
	// ( y.equals("") ) is true
	// ( y == null ) is false

	public static void main(String[] args) {

		String[] arr = { "zero", "one", "two", "three", "four", "five" };


		Question1 q1 = new Question1();

		q1.convert(arr);
		
		//System.out.println("\n++++++++++++++++++++++\n");

		q1.replace(2);
		q1.replace(4);
		
		//System.out.println("\n++++++++++++++++++++++\n");

		List<String> compacted = q1.compact();
		// print compacted and should produce
		// zero, one, three, five

	}

	ArrayList<String> list = new ArrayList<>();

	String[] arr = { "zero", "one", "two", "three", "four", "five" };

	Question1() {
		// in the constructor create a new array list
	}

//know how to convert an array of strings to a list of strings 
	public void convert(String[] arr) {
		// add the elements in the string array to the
		// ArrayList of strings

		for (int i = 0; i < arr.length; i++) {
	
			list.add(arr[i]);
		}
		System.out.println(list);
		System.out.println("\n+++++++++++++++++++++++\n");
	}

	public void replace(int idx) {
		// in an ArrayList write the value at idx
		// to be an empty string

		for (int i = 0; i < arr.length; i++) {
			if (i == idx) {
				list.set(i, " ");
			}else {
		}
		}

		// print a message saying
		// what the value of the position in the list is
		// and the value you are overwriting it with
		System.out.println("The value of the position in the list: " + idx + "\t");
		System.out.println("The value we are overwriting it with is: \" \"");

		System.out.println("testing...." + list);
		System.out.println("\n+++++++++++++++++++++++\n");

	}

	public ArrayList<String> compact() {
		// remove all values in the array list
		// that are empty strings
		// must use .equals and not ==
		//ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(" ")) {
				list.remove(i);
			}
		}
		System.out.println(list);

		return list;

	}

}
