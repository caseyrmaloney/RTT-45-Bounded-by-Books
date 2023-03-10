package hibernate;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name = "movie_rental") 
public class MovieRental {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "user_id", insertable=false, updatable=false)
	private Integer userId;
	
	@Column(name = "checkout_date", columnDefinition = "TIMESTAMP")
	private Integer lastName;
	
	@Column(name = "checkin_date",  columnDefinition = "TIMESTAMP")
	private Integer checkinDate;
	
	//add  insertable because they are both being reference 
	@Column(name = "movie_id", insertable=false, updatable=false)
	private Integer movieId;
	
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", nullable = true)
    private User user;
	
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.EAGER, optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id", nullable = true)
    private Movie movie;
	
	
}
