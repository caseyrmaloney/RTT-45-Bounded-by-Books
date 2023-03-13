package hibernate;

import java.util.List;


//this is my testing class to see if the functions are working correctly before scan is inputed 
public class HibernateMain {
	
	public static void main(String[] args) { 
		
		//checking if DAO and connections are working 
		
		Student student = new Student(); 
		StudentDAO studentDAO = new StudentDAO(); 
		Course course = new Course(); 
		CourseDAO courseDAO = new CourseDAO(); 
		
		//HIBERNATE WORKING WITH INSERTING AND NOT 
		
		//inserting a student
//		student.setEmail("hibernate@email.com");
//		student.setName("Testing Hibernate");
//		student.setPassword("pass");
//		studentDAO.insert(student);
		
		//inserting a new course 
//		course.setName("Hibernate Checking");
//		course.setInstructor("Hibernate");
//		courseDAO.insert(course);
		
		//deleting the hibernate test cases from database 
//		course = courseDAO.findById(12); 
//		courseDAO.delete(course);
//		
//		student = studentDAO.findById(12); 
//		studentDAO.delete(student);
		
		//checking if the getAllCourses Print
		
		//courseDAO.getAllCourses();
		
		//checking getAllStudents 
		//studentDAO.getAllStudents();
		
//		List<Student> name = studentDAO.getStudentByEmail("test@testing.com");
//		for( Student s : name) {
//			System.out.println(s);
//		}
		
		//checking valid user 
		
		//System.out.println(studentDAO.validateStudent("test@testing", "pass")); 
		 

	}

}
