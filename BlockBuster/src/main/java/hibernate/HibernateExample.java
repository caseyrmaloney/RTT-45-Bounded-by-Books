package hibernate;

import java.util.Date;

public class HibernateExample {
	
	//global variables to allow functions to use the object 
	static User user = new User();

	
	public static void main(String [] args ) { 
		
		// can add another 1 or 2 user and move using hibernate

		// _____________________________________________________________________________
		
		//  adding movies into the database
		
//		Movie movie = new Movie(); 
//		MovieDAO movieDAO = new MovieDAO(); 
//		
//		movie.setName("Harry Potter and the Prisoner of Azkaban");
//		movie.setYearReleased(2004);
//		movie.setRating(78);
//		movie.setRentalPrice(6.78);
//		movie.setLateFee(2.99);
//		movieDAO.insert(movie);
//		
//		movie.setName("Harry Potter and the Goblet of Fire");
//		movie.setYearReleased(2005);
//		movie.setRating(86);
//		movie.setRentalPrice(6.79);
//		movie.setLateFee(2.99);
//		movieDAO.insert(movie);
		
		//inserting a new user using Hibernate 
		//User user = new User();
		//UserDAO userDAO = new UserDAO(); 
		
//		user.setFirstName("Jen");
//		user.setLastName("Maloney");
//		user.setEmail("email3@email.com");
//		user.setPassword("password");
//		
//		Date date = new Date();  
//		user.setCreateDate(date);
//		
//		userDAO.insert(user);
		
				
		// __________________________________
		

		// create a changePassword( UserId, Password ) function that updates the user ( not in the DAO )
		
		
		UserDAO userDAO = new UserDAO(); 
		
		user = userDAO.findById(5); 
		
		user.setPassword(changePassword(5, "newpassword"));
		
		userDAO.update(user);
		
		
		// create a checkOut( Movie, User ) and checkIn ( Movie, User ) ( not in the DAO )
		// create a function that will show the list movies that are checked out and the users that have them checked out ( not in the DAO )
		// BONUS .. add a due date to the movie rental table and a function double calculateLateFee(User, Movie, FutureDate)
		// 3:08
		// DOUBLE SECRET BONUS - hook it up to a menu with the scanner
		
		
		
		
	}
	
	
	// create a changePassword( UserId, Password ) function that updates the user ( not in the DAO )
	
	public static String changePassword (int UserId, String password) { 
		
		String pass=""; 
		
		
		if(user.getId() == UserId ) { 
			pass = password; 
			
		}
		else { 
			System.out.println("Please enter a vaild password");
		}
		
		return pass; 
	}
	
	//checkOut( Movie, User )
	
	

}
