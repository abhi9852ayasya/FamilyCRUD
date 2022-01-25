package prodCrud.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Self")
public class Self implements Serializable {
	

    
	
	 @Id
	 @Column(name="self_id")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long sid;
	 
	
	 @OneToOne(cascade = CascadeType.ALL)
	 private Spouse spouse;
	 
	
	 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	 private Set<Child> child;
	 
	
	 @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
     private Set<MedicalHistory> medicalHistory;



	public Self(Long sid, Spouse spouse, Set<Child> child, Set<MedicalHistory> medicalHistory, String userName,
			Date userDob, Double userTob, String userPob, Date userAnniversary, long userMobNumber, String userEmail,
			String userBloodGroup, String userEmergency, String userOrganization, String userQualification) {
		super();
		this.sid = sid;
		this.spouse = spouse;
		this.child = child;
		this.medicalHistory = medicalHistory;
		this.userName = userName;
		this.userDob = userDob;
		this.userTob = userTob;
		this.userPob = userPob;
		this.userAnniversary = userAnniversary;
		this.userMobNumber = userMobNumber;
		this.userEmail = userEmail;
		this.userBloodGroup = userBloodGroup;
		this.userEmergency = userEmergency;
		this.userOrganization = userOrganization;
		this.userQualification = userQualification;
	}












	public Set<Child> getChild() {
		return child;
	}












	public void setChild(Set<Child> child) {
		this.child = child;
	}












	public Set<MedicalHistory> getMedicalHistory() {
		return medicalHistory;
	}












	public void setMedicalHistory(Set<MedicalHistory> medicalHistory) {
		this.medicalHistory = medicalHistory;
	}






	private String userName;
	
	private Date userDob;
	private Double userTob;
	private String userPob;
	
	private Date userAnniversary;
	private long userMobNumber;
	
	
	@Size(min = 1, max = 100)
	@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
	private String userEmail;
	
	private String userBloodGroup;
	
	private String userEmergency;
	
	private String userOrganization;
	
	private String userQualification;


    private String aboutMe;
	
	
	
	public String getAboutMe() {
		return aboutMe;
	}



	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}


	@Override
	public String toString() {
		return "Self [sid=" + sid + ", spouse=" + spouse + ", child=" + child + ", userName=" + userName + ", userDob="
				+ userDob + ", userTob=" + userTob + ", userPob=" + userPob + ", userAnniversary=" + userAnniversary
				+ ", userMobNumber=" + userMobNumber + ", userEmail=" + userEmail + ", userBloodGroup=" + userBloodGroup
				+ ", userEmergency=" + userEmergency + ", userOrganization=" + userOrganization + ", userQualification="
				+ userQualification + "]";
	}


	public Long getSid() {
		return sid;
	}






	public void setSid(Long sid) {
		this.sid = sid;
	}






	public Spouse getSpouse() {
		return spouse;
	}






	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}











	public String getUserName() {
		return userName;
	}






	public void setUserName(String userName) {
		this.userName = userName;
	}






	public Date getUserDob() {
		return userDob;
	}






	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}






	public Double getUserTob() {
		return userTob;
	}






	public void setUserTob(Double userTob) {
		this.userTob = userTob;
	}






	public String getUserPob() {
		return userPob;
	}






	public void setUserPob(String userPob) {
		this.userPob = userPob;
	}






	public Date getUserAnniversary() {
		return userAnniversary;
	}






	public void setUserAnniversary(Date userAnniversary) {
		this.userAnniversary = userAnniversary;
	}






	public long getUserMobNumber() {
		return userMobNumber;
	}






	public void setUserMobNumber(long userMobNumber) {
		this.userMobNumber = userMobNumber;
	}






	public String getUserEmail() {
		return userEmail;
	}






	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}






	public String getUserBloodGroup() {
		return userBloodGroup;
	}






	public void setUserBloodGroup(String userBloodGroup) {
		this.userBloodGroup = userBloodGroup;
	}






	public String getUserEmergency() {
		return userEmergency;
	}






	public void setUserEmergency(String userEmergency) {
		this.userEmergency = userEmergency;
	}






	public String getUserOrganization() {
		return userOrganization;
	}






	public void setUserOrganization(String userOrganization) {
		this.userOrganization = userOrganization;
	}






	public String getUserQualification() {
		return userQualification;
	}






	public void setUserQualification(String userQualification) {
		this.userQualification = userQualification;
	}






	public Self() {
		super();
		
	}
	
	
	

}
