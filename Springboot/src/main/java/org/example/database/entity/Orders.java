package org.example.database.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity 
@ToString 
@Table(name="orders")

public class Orders {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "customer_id")
	private Integer customerId; 
	
	@Column(name = "order_date")
	private Date orderDate; 
	
	@Column(name = "required_date")
	private Date requiredDate; 
	
	@Column(name = "shipped_date")
	private Date shippedDate; 
	
	@Column(name = "status")
	private String status; 
	
	@Column(name = "comments", columnDefinition = "TEXT")
	private String comments; 
	
	@ToString.Exclude
	@OneToMany(mappedBy = "order", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
	
	
	
//	@ToString.Exclude
//	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
//    @JoinTable(name = "orderdetails",
//            joinColumns = {
//                    @JoinColumn(name = "order_id", referencedColumnName = "id",
//                            nullable = false, updatable = false)}
//            )
//	//private List<OrderDetails> orderDetail = new ArrayList<OrderDetails>();
//	private List<OrderDetails> orderDetails = new ArrayList<OrderDetails>();
	
	
	
	
	
	
	
	
	
	

}
