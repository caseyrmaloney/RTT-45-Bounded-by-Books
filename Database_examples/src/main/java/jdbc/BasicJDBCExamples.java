package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BasicJDBCExamples {

	public static void main(String[] args) {
		
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "leomaloney1204";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		
		try {
			///use a scanner to get a name from the user 
			
			Scanner scan = new Scanner(System.in); 
			
			System.out.print("Enter a first name or a last name: ");
			String name = scan.nextLine(); 
			
			
			
			
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			//String SelectSQL = "Select * FROM employees";
			
			//String firstName = "Steve"; 
			String SelectSQL = "Select * FROM employees where firstName = ? or lastName = ? ";
			
			//this is a JDBC class that creates the statement which will in turn run the SQL 
			// this kind of statement isn't normally used want to use a prepared statement 
			//Statement stmt = connection.createStatement();
			
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			// the 1 is to replace varaible selectSQL with the first question mark 
			stmt.setString(1, name); 
			stmt.setString(2, name); 
			
			//using the statement to execute a query and out the results into the resultset object 
			ResultSet result = stmt.executeQuery();
			
			//looping over the results set 
			while (result.next()) {
				String EmployeeID = result.getString("employeeNumber");
				String fname = result.getString("firstName");
				String lname = result.getString("lastName");
				String email = result.getString("email");
				System.out.println(EmployeeID + " | " + fname + " | " + lname + " | " + email);
			}
			
			scan.close(); 
			
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
