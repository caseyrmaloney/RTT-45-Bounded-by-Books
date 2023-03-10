package hibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "movie") 
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "year_released")
	private Integer yearReleased;
	
	@Column(name = "rating")
	private Integer rating;
	
	@Column(name = "rental_price", columnDefinition="decimal", precision=18, scale=3)
	private Double rentalPrice;
	
	@Column(name = "late_fee", columnDefinition="decimal", precision=18, scale=3)
	private Double lateFee;
	
	 @ToString.Exclude
	 @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 private List<MovieRental> movieRental = new ArrayList <MovieRental>();

}
