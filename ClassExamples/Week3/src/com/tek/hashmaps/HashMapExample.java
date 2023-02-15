package com.tek.hashmaps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) { 
		
		
		//Map <K, V> 
		//this is a map with strings as a key and string as a value 
		Map<String,String> dictionary = new HashMap<>(); 
		
		dictionary.put("key", "value"); 
		dictionary.put("concat", "to add 2 strings together"); 
		dictionary.put("instanciate","to cerate a new object"); 
		
		//find the key in the map and prints out the value - think it like an index printing out the value at key (index) 
		//the key though can be any type of data type like string, int, float, double, ect. 
		//System.out.println(dictionary.get("concat")); 
		
		//for loop to get the value in dictionary with the key as string value 
		//getting the value of the keys 
		for (String key: dictionary.keySet()) { 
			System.out.println(key + "= " + dictionary.get(key));
			
		}
		
		//output can not be in the same order that you put it in

		
		System.out.println ("==============================");
		
		//this is a map with string as a key and integer as a value 
		Map<String, Integer> intMap = new HashMap<>(); 
		
		intMap.put("key", 1); 
		
		

		System.out.println ("==============================");
		
		Map<Integer, String> sintMap = new HashMap<>(); 
		sintMap.put(1, "a"); 
		sintMap.put(2, "b"); 
		sintMap.put(3, "c"); 
		sintMap.put(4, "d"); 
		
		//System.out.println(sintMap.get(3));
		//override for key 3 
		sintMap.put(3, "THREE"); 
		System.out.println(sintMap.get(3));
		
		System.out.println ("------------");
		
		//key is type int and they are giving the values of the key 
		for (Integer key:  sintMap.keySet()) { 
			System.out.println(key);
			
		}
		
		
	}

}
