package classes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User  {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String email;
	private String password;
	
	
	public User() {
	}


	public User(Integer id, String email, String password) {

		this.Id = id;
		this.email = email;
		this.password = password;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "User [Id=" + Id + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
