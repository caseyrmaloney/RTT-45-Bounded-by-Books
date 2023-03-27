package org.example.database.entity;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity 
@ToString 
@Table(name="orderdetails") //table name in the database 


public class OrderDetails {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id; 
	
	@Column(name = "order_id", insertable=false, updatable=false)
	private Integer orderId; 
	
	@Column(name = "product_id")
	private Integer productId; 
	
	@Column(name = "quantity_ordered")
	private Integer quantityOrdered; 
	
	@Column(name = "price_each", columnDefinition="decimal", precision= 18, scale= 3)
	private Double priceEach; 
	
	
	//SMALL INT 
	@Column(name = "order_line_number", columnDefinition = "SMALLINT")
	private Integer orderLineNumber; 
	
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order;
	
	
	

}
