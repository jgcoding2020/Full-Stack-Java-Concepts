package cogent.infotech.com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_name;
	private String last_name;
	private String email;
	@Lob
	@Column(name="picture", columnDefinition="Blob")
	private String picture;
	
	public User() {
		super();
	}


	public User(String first_name, String last_name, String email, String picture) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.picture = picture;
	}
}
