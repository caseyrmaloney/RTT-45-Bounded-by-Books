package hibernate;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OrderDetailsDAO {
	
	public OrderDetails findById(Integer id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();

		// this is HQL which is hibernate query language
		// also referred to as JPA
		String hql = "FROM OrderDetails c where c.id = :idParam";

		TypedQuery<OrderDetails> query = session.createQuery(hql, OrderDetails.class);
		query.setParameter("idParam", id);

		// when we know we are getting as single record we use getSingleResult
		OrderDetails result = query.getSingleResult();

		session.close();

		return result;
	}

	public void insert(OrderDetails orderDetails) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.save(orderDetails);
		session.getTransaction().commit();
		session.close();
	}

	public void update(OrderDetails orderDetails) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.merge(orderDetails);
		session.getTransaction().commit();
		session.close();
	}

	public void delete(OrderDetails orderDetails) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.getTransaction().begin();
		session.delete(orderDetails);
		session.getTransaction().commit();
		session.close();
	}

}
