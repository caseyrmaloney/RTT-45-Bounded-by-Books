package com.tek.FileandIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using a . means the current directory 
		//using a .. means the parent directory 
		
		
		//relative path is based on where you are in the folder structure 
		//absolute path is from the root of the folder structure 
		
		//this uses an absolute path to get the starting directory of this project 
		File file = new File("./src/com/tek/FileandIO"); 
		
		File file2 = new File("../"); 
		
		
		//printing absolute path get us the full path from the root 
		System.out.println(file.getAbsolutePath()); 
		
		
		if(file.isDirectory()) { 
			System.out.println(file.getName() + " is a directory");
			System.out.println(file.getParentFile() + " is the parent directory"); 
		}
		
		for(File f : file.listFiles()) { 
			System.out.println(f.getName()); 
		}
		
		
		File code = new File ("./src/com/tek/FileandIO/FileExample.java");
		
		System.out.println("The file exists: "+ code.exists()); 
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(code));
			
			String line = br.readLine(); 
			
			while(line != null) { 
				System.out.println(line);
				line = br.readLine(); 
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		} 
		
		
		
		
		
		
		

		

	}

}
