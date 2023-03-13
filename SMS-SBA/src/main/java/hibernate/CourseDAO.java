package hibernate;

import java.util.List;

import javax.persistence.TypedQuery;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CourseDAO {

	public Course findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Course c where c.id = :idParam";

		TypedQuery<Course> query = session.createQuery(hql, Course.class);
		query.setParameter("idParam", id);

		// when we know we are getting as single record we use getSingleResult
		Course result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(course);
		session.getTransaction().commit();
		session.close();
	}

	public void update(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(course);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Course course) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(course);
		session.getTransaction().commit();
		session.close();
	}

	// ADDING THE FUNCTION GET ALL COURSES();
	public void getAllCourses() {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "from Course";

		TypedQuery<Course> query = session.createQuery(hql, Course.class);

		List<Course> courseList = query.getResultList();

		System.out.println("COURSE ID \t COURSE NAME \t  \t  \t \t \t COURSE INSTRUCTOR");

		// iterate through the courselist to print all courses
		for (Course course : courseList) {
			System.out.println(course.getCId() + " \t \t --> " + course.getCName() + "          \t \t \t \t---> "
					+ course.getCInstructorName());
		}

		session.close();

	}



}
