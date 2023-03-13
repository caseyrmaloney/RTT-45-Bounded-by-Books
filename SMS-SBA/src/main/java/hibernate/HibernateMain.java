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
		StudentCourse studentCourse = new StudentCourse(); 
		StudentCourseDAO studentCourseDAO = new StudentCourseDAO(); 
		
		//HIBERNATE WORKING WITH INSERTING AND NOT 
		
		//inserting a student
//		student.setSEmail("hibernate@email.com");
//		student.setSName("Testing Hibernate");
//		student.setSPass("pass");
//		studentDAO.insert(student);
		
		//inserting a new course 
//		course.setCName("Hibernate Checking");
//		course.setCInstructorName("Hibernate");
//		courseDAO.insert(course);
		
		//deleting the hibernate test cases from database 
//		course = courseDAO.findById(13); 
//		courseDAO.delete(course);
//	
//		student = studentDAO.findById(15); 
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
		
		//checking if student course DAO works 
		studentCourse.setCourseId(2);
		studentCourse.setStudentId(11);
		studentCourseDAO.insert(studentCourse);
		 

	}

}
