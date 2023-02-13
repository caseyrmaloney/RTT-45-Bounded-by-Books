package com.tek.week3.libapp;

public class AdultUsers implements LibraryUser {

	
	
	
	@Override
	public void registerAccount(int age) {
		// TODO Auto-generated method stub
		
		if (age >= 12) { 
			System.out.println("You have successfully registered under an Adult Account");
		}
		
		else { 
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			
		}
		
	}

	@Override
	public void requestBook(String bookType) {
		// TODO Auto-generated method stub
		
		if (bookType == "Fiction") { 
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		
		else { 
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
		
	}

}
