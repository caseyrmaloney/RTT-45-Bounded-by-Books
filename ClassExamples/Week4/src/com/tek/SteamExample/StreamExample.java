package com.tek.SteamExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>(); 
		names.add("Larry"); 
		names.add("Steven");
		names.add("Eric");
		names.add("Jessica");
		names.add("Ellen");
		
		//sort the original names list by length of name using a stream 
		//once this is working then sort secondary by alphabetically 
		
		
//		Lambda expression 1 – (str1, str2) -> str1.length() – str2.length()
//		Lambda expression 2 – (str1, str2) -> Integer.compare(str1.length(), str2.length())
//		Method References – Comparator.comparingInt(String::length)
//		
		names.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));	
		
		
		System.out.println("\nAscending-order Sorted String List "
                + "by its Length : \n" + names + "\n");
		
		
		
		
		List <String> sortedList = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()); 
		
		System.out.println(String.join("\n", sortedList) + "\n");
		
		System.out.println("=================================");
		
		//remove all names from the list that contain an n 
		
		sortedList.removeIf(name -> name.contains("n")); 
		
		sortedList.forEach(name-> System.out.println(name));
		
		

	}

}
