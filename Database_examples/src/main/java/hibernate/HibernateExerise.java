package hibernate;

import java.util.Calendar;
import java.util.Date;

public class HibernateExerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		OrderDAO orderDAO = new OrderDAO(); 
		Orders order = new Orders(); 
		
		
		//insert a new order 
		order.setCustomerId(128);
		order.setOrderDate( new Date());
		
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, 5);
		Date fiveDays = cal.getTime();
		order.setRequiredDate(fiveDays);
		
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -2);
		Date twoDays = cal.getTime();
		order.setShippedDate(twoDays);
		
		order.setStatus("Shipped");
		
		order.setComments("Shipping in progress");
		
		orderDAO.insert(order); 
		
		

	

				

	}

}
