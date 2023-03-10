package hibernate;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDAO {

	public void insert(User user) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	public void update(User user) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(user);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(User user) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(user);
		session.getTransaction().commit();
		session.close();
	}

	public List<User> findByContactFirstName(String name) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM User c where c.contactFirstname = :firstname";

		TypedQuery<User> query = session.createQuery(hql, User.class);
		query.setParameter("firstname", name);

		// when we know we are getting 0 or more records we use getResultList
		List<User> result = query.getResultList();

		session.close();

		return result;
	}

	public User findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM User c where c.id = :idParam";

		TypedQuery<User> query = session.createQuery(hql, User.class);
		query.setParameter("idParam", id);

		// when we know we are getting as single record we use getSingleResult
		User result = query.getSingleResult();

		session.close();

		return result;
	}

	public void deleteById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "delete FROM User c where c.id = :idParam";

		Query query = session.createQuery(hql);
		query.setParameter("idParam", id);

		// when we are doing an update / delete / insert to the database with HTL
		// we use query.executeUpdate();
		session.getTransaction().begin();
		query.executeUpdate();
		session.getTransaction().commit();

		session.close();
	}

}
