package hibernate;

import java.util.Calendar;
import java.util.Date;

public class HibernateExerise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
//		OrderDAO orderDAO = new OrderDAO(); 
//		Orders order = new Orders(); 
//		
//		
//		//insert a new order 
//		order.setCustomerId(128);
//		order.setOrderDate( new Date());
//		
//		
//		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
//		cal.add(Calendar.DATE, 5);
//		Date fiveDays = cal.getTime();
//		order.setRequiredDate(fiveDays);
//		
//		cal.setTime(new Date());
//		cal.add(Calendar.DATE, -2);
//		Date twoDays = cal.getTime();
//		order.setShippedDate(twoDays);
//		
//		order.setStatus("Shipped");
//		
//		order.setComments("Shipping in progress");
//		
//		orderDAO.insert(order); 
//		
//		// updating existing order 
//		
//		order = orderDAO.findById(10100); 
//		order.setComments("Its on the way");
//		orderDAO.update(order);
//		
//		//delete existing order 
//		order = orderDAO.findById(10100); 
//		orderDAO.delete(order);
//		
		
		// _______________________________________________// 
		
		//product  
//		ProductDAO productDAO = new ProductDAO(); 
//		Product product = new Product(); 
//		
//		//insert a new product 
//		product.setProductCode("R2D2_3CPO");
//		product.setProductName("Wacky Waving Inflatable Arm=Flailing TubeMan");
//		product.setProductLineId(7);
//		product.setProductScale("1:10");
//		product.setProductVendor("Al Harrington's WWIA-FT E&W");
//		product.setProductDescription("A tube man, also known as a skydancer, air dancer, "
//				+ "inflatable man and originally called the Tall Boy, is an inflatable stick "
//				+ "figure comprising sections of fabric tubing attached to a fan. As the fan blows "
//				+ "air through it, the tubing moves in a dynamic dancing or flailing motion.");
//		product.setQuantityInStock(1000);
//		product.setBuyPrice(59.99);
//		product.setMsrp(90.57);
//		
//		productDAO.insert(product);
//		
//		
//		
//		
//		//updating existing product 
//		product = productDAO.findById(111); 
//		product.setQuantityInStock(267);
//		productDAO.update(product);
//		
//		
//		//deleting existing order 
//		product = productDAO.findById(112); 
//		productDAO.delete(product);
//		
		
		
		// _______________________________________________// 
		
		//order details 
		OrderDetailsDAO orderDetailDAO = new OrderDetailsDAO(); 
		OrderDetails orderDetails = new OrderDetails(); 
		OrderDAO orderDAO = new OrderDAO(); 
		
		
		//insert a new order detail 
		orderDetails.setOrderId(10427);
		orderDetails.setProductId(113);
		orderDetails.setQuantityOrdered(29);
		orderDetails.setPriceEach(38.99);
		orderDetails.setOrderLineNumber(3);
		orderDetails.setOrder(orderDAO.findById(10427));
		
		//orderDetailDAO.insert(orderDetails);
	
		//update existing order detail
		orderDetails = orderDetailDAO.findById(2997);
		orderDetails.setQuantityOrdered(115);
		orderDetailDAO.update(orderDetails);
		
		//delete existing order detail
		orderDetails = orderDetailDAO.findById(2997);
		orderDetailDAO.delete(orderDetails);
				

	}

}
