package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieRentalDAO {

	public MovieRental findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM MovieRental c where c.id = :idParam";

		TypedQuery<MovieRental> query = session.createQuery(hql, MovieRental.class);
		query.setParameter("idParam", id);

		// when we know we are getting as single record we use getSingleResult
		MovieRental result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(movieRental);
		session.getTransaction().commit();
		session.close();
	}

	public void update(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(movieRental);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(MovieRental movieRental) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(movieRental);
		session.getTransaction().commit();
		session.close();
	}

}
