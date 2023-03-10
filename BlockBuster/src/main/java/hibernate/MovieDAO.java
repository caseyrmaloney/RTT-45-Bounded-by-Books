package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MovieDAO {
	
	public Movie findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		String hql = "FROM Movie m where m.id = :idParam";
		TypedQuery<Movie> query = session.createQuery(hql, Movie.class);
		query.setParameter("idParam", id);
		Movie result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(movie);
		session.getTransaction().commit();
		session.close();
	}

	public void updateOrder(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(movie);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(Movie movie) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(movie);
		session.getTransaction().commit();
		session.close();
	}
	

}
