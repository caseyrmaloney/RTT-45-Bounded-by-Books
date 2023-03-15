package hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SMSMain {

	
	private Student currentStudent;

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SMSMain sms = new SMSMain(); 
		sms.run();

	}

	private void run() {

		// switch case for login in or quit
		switch (logInMenu()) {
		case 1:
			if (studentLogin()) {
				registerMenu(); 
			}
			break;
		case 2:
			System.out.println("Goodbye!");
			break;

		default:
		}

	}

	//log in 
	private int logInMenu() {
		
		System.out.println("Welcome to your School Management System!");
		System.out.println();
		System.out.println("Are you a(n)");
		System.out.println();
		System.out.println("1. Student");
		System.out.println("2. Quit");
		System.out.println();
		System.out.print("Please enter a 1 or 2: ");
		
		int input = scanner.nextInt(); 
		
		//returning the input for switch case 
		return input; 
		
		

	}
	
	//student Log in 
	private boolean studentLogin() { 
		
		boolean retValue = false; 
		
		System.out.println();
		System.out.println("Enter your email: ");
		String email = scanner.next(); 
		
		System.out.println();
		System.out.println("Enter your password: ");
		String password = scanner.next(); 
		
		
		StudentDAO studentDAO = new StudentDAO(); 
		List<Student> student = new ArrayList<Student>(); 
		student = studentDAO.getStudentByEmail(email); 
		
		
		//while student is valid 
		while(studentDAO.validateStudent(email, password)){ 
			
			if(student != null) { 
				currentStudent = student.get(0); 
			}
			
			System.out.println(); 
			System.out.println(); 
			System.out.println("My Classes: ");
			System.out.println();  
			System.out.println("COURSE ID \t COURSE NAME \t \t COURSE INSTRUCTOR"); 
			//get the id of current student 
			int id = currentStudent.getId(); 
			List<Course> courses = studentDAO.getStudentCourses(id); 
			
			retValue = true; 
			break; 
			
		}
		
		//if student is not valid 
		if(studentDAO.validateStudent(email, password) == false) { 
			System.out.println("User Valitdation failed. Goodbye!"); 
		}
		
		
		
		
		return retValue; 
		
	}
	
	
	private void registerMenu() { 
		System.out.println(); 
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1. Register for a class ");
		System.out.println("2. Logout");
		System.out.println();
		System.out.print("Please enter a 1 or 2: ");
		
		int input = scanner.nextInt(); 
		
		switch(input) { 
		case 1: 
			
			CourseDAO courseDAO = new CourseDAO(); 
			List<Course> courseList = courseDAO.getAllCourses(); 
			
			System.out.println(); 
			System.out.println();
			System.out.println("All Courses: ");
			System.out.println();
			System.out.println("COURSE ID \t COURSE NAME \t  \t  \t \t \t COURSE INSTRUCTOR");

			for (Course course : courseList) {
				System.out.println(course.getCId() + " \t \t "+ course.getCName() + " \t "
						+ " \t \t \t \t " + course.getCInstructorName());
			}
			
			System.out.println();
			System.out.print("Please enter a course number: ");
			
			int courseNum= scanner.nextInt(); 
			
			Course newCourse = new Course(); 
			newCourse = courseDAO.findById(courseNum); 
			int id = currentStudent.getId();
			
			
			if(newCourse != null) { 
				StudentDAO studentDAO = new StudentDAO(); 
				studentDAO.registerStudentToCourse(courseNum, id);
				System.out.println(); 
				System.out.println();
				System.out.println("Goodbye!");
			}
			break; 
			
		case 2: 
			default: 
				System.out.println();
				System.out.println("Goodbye!");
			
			
		}
	}
}
