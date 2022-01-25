package prodCrud.Entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "User")
public class User implements Serializable {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	 @Id
	 @Column(name="user_id")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long uId;
	 
	

	

	
	private String firstName;
	

	private String lastName;
	
	
	private String userName;
	
	
	private String password;

	private long phoneNumber;

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User(Long uId, String firstName, String lastName, String userName, String password, long phoneNumber) {
		super();
		this.uId = uId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
