package hibernate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//simple test using junit 
//testing to see if we can get the student from the email- 
//since they use the email to log in 
public class StudentTest {
	

	@Test
	public void getStudentByEmailTest() {
		Student student = new Student();
		
		student.setSEmail("test@testing.com");
		student.setSName("Test Name");
		
		
		//passes 
		//assertEquals("Test Name", student.getSName());
		
		//fails 
		assertEquals("Wrong Name", student.getSName());
	}
	

}
