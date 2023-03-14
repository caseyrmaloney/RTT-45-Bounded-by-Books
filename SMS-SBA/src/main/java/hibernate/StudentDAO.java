package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public Student findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Student c where c.id = :idParam";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);
		query.setParameter("idParam", id);

		// when we know we are getting as single record we use getSingleResult
		Student result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(student);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(student);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Student student) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(student);
		session.getTransaction().commit();
		session.close();
	}

	public List<Student> getAllStudents() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "from Student";

		TypedQuery<Student> query = session.createQuery(hql, Student.class);

		List<Student> studentList = query.getResultList();

		//System.out.println("STUDENT ID \t STUDENT EMAIL \t  \t \t \t \t STUDENT NAME");

//		// iterate through the courselist to print all courses
//		for (Student student : studentList) {
//			System.out.println(student.getId() + " \t \t --> " + student.getSEmail() + " \t \t \t \t --> " +student.getSName());
//		}
		

		session.close();
		
		return studentList; 

	}

	public List<Student> getStudentByEmail(String studentEmail) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Student s where s.sEmail = :email";
		
		TypedQuery<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("email", studentEmail);
		
		// when we know we are getting 0 or more records we use getResultList
		List<Student> result = query.getResultList();
		
		session.close();
		
		return result;
		
	
	}

	public boolean validateStudent(String email, String pass) {
		
		//return true if valid 
		//return false if not a student 
		
		//for loop through the list of students getAllStudents 
		//if email = student email and pass = student pass 
		//true
		
		
		StudentDAO sDAO = new StudentDAO(); 
		
		//create a list of all students 
		List<Student> studentList = new ArrayList<Student>(); 
		
		//set list with function 
		studentList = sDAO.getAllStudents(); 
		
		
		//iterate through the list 
		for(Student student : studentList) {
			//use .equal to see if they match 
			if(student.getSEmail().equals(email) && student.getSPass().equals(pass)) { 
				return true; 
			}
			
		}
		
		return false;  
		

	}
	
	

	public void registerStudentToCourse(int courseId, int studentId, String studentEmail) {
		
		CourseDAO courseDAO = new CourseDAO(); 
		
		//prompt for all the courses 
		System.out.println("All Courses: ");
		courseDAO.getAllCourses();
		
		//register for the course 
		StudentCourse sc = new StudentCourse(); 
		StudentCourseDAO dao = new StudentCourseDAO(); 
		Student student = new Student(); 
		StudentDAO sDAO = new StudentDAO(); 
		Course course = new Course (); 
		CourseDAO cDAO = new CourseDAO(); 
		
		student = sDAO.findById(studentId); 
		course = cDAO.findById(courseId); 
		
		
		sc.setStudent(student);
		sc.setCourse(course);		
		dao.insert(sc);
		
		//printing out the student courses 
		getStudentCourses(studentId); 
		

	}

	public List<Course> getStudentCourses(int id) {
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		
		// this is HQL which is hibernate query language
		// also referred to as JPA
		
		 
		
		int studentId = id;  
		
		
		String hql = "FROM StudentCourse sc where sc.studentId = :studentId";
		
		TypedQuery<StudentCourse> query = session.createQuery(hql, StudentCourse.class);
		query.setParameter("studentId", studentId);
		
		// when we know we are getting 0 or more records we use getResultList
		List<StudentCourse> result = query.getResultList();
		
		session.close();
		
		CourseDAO cDAO = new CourseDAO(); 
		List<Course> courseList = new ArrayList<Course>(); 
		
		
		courseList= cDAO.getAllCourses(); 
		
		List<Course> studentCourses = new ArrayList<Course>(); 
		
		
		//System.out.println("Course ID \t Course Name \t Course Instructor");
		
		for(StudentCourse sc: result) { 
			for (Course course : courseList) { 
				if(course.getCId() == sc.getCourseId()) { 
					//studentCourses.add(course); 
					
					System.out.println(course.getCId() + " \t \t "+ course.getCName() + " \t "
							+ "" + course.getCInstructorName());
				}
			}
		}
		
		return studentCourses; 
		

	}

}
