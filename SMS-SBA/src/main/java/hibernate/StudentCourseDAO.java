package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentCourseDAO {
	public StudentCourse findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM StudentCourse c where c.id = :idParam";

		TypedQuery<StudentCourse> query = session.createQuery(hql, StudentCourse.class);
		query.setParameter("idParam", id);

		// when we know we are getting as single record we use getSingleResult
		StudentCourse result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(StudentCourse studentCourse) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(studentCourse);
		session.getTransaction().commit();
		session.close();
	}

	public void update(StudentCourse studentCourse) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(studentCourse);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(StudentCourse studentCourse) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(studentCourse);
		session.getTransaction().commit();
		session.close();
	}

}
