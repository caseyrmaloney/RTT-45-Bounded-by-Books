package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


// list of all the customers that have mad a payment larger than amount 
// print the checkNumber, amount (formatted to $0.00), and the customer name ordered by the largest amount first 
// input variable is the amount from scanner 

public class AggregateJDBCExample {
	
public static void main(String[] args) {
		
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "leomaloney1204";
		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		
		try {
			///use a scanner to get a name from the user 
			
			Scanner scan = new Scanner(System.in); 
			
			System.out.print("Enter an amount:  ");
			int amount = scan.nextInt(); 
			scan.nextLine(); 
			System.out.print("Enter a state:  ");
			String cState = scan.nextLine(); 
			
			
			
			
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(dburl, user, password);
			//String SelectSQL = "Select * FROM employees";
			
			//String firstName = "Steve"; 
			String SelectSQL ="select pay.amount, c.customerName, c.state\n"
					+ "from customers c, payments pay\n"
					+ "where pay.customerNumber = c.customerNumber\n"
					+ "and pay.amount > ?\n"
					+ "and c.state = ?\n"
					+ "order by pay.amount desc ;  ";;
			
			//this is a JDBC class that creates the statement which will in turn run the SQL 
			// this kind of statement isn't normally used want to use a prepared statement 
			//Statement stmt = connection.createStatement();
			
			PreparedStatement stmt = connection.prepareStatement(SelectSQL);
			// the 1 is to replace varaible selectSQL with the first question mark
			stmt.setInt(1, amount);
			stmt.setString(2, cState);
			
			
			//using the statement to execute a query and out the results into the resultset object 
			ResultSet result = stmt.executeQuery();
			
			//looping over the results set 
			while (result.next()) {
				String customerName = result.getString("customerName");
				String payments = result.getString("amount");
				String state = result.getString("state");
				
				System.out.println(customerName + " | $" + payments + " | " + state);
				System.out.println();
			}
			
			scan.close(); 
			
			
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
