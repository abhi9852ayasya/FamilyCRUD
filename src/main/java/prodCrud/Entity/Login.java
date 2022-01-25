package prodCrud.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	 @Id
	 @Column(name="login_id")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long lId;
	
	public Long getlId() {
		return lId;
	}

	public void setlId(Long lId) {
		this.lId = lId;
	}

	private String userName;
	
	private String password;

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

	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [lId=" + lId + ", userName=" + userName + ", password=" + password + "]";
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
