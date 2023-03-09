package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDAO {
	
	public Orders findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM Orders c where c.id = :idParam";
		
		TypedQuery<Orders> query = session.createQuery(hql,Orders.class);
		query.setParameter("idParam", id);
		
		// when we know we are getting as single record we use getSingleResult
		Orders result = query.getSingleResult();
		
		session.close();
		
		return result;
	}
	
	public void insert(Orders orders) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(orders);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(Orders orders) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(orders);
		session.getTransaction().commit();
		session.close();
	}
	
	public void delete(Orders orders) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(orders);
		session.getTransaction().commit();
		session.close();
	}

}
