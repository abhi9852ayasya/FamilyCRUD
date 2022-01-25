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
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Child implements Serializable{
	
	@ManyToOne
	private Self self;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<MedicalHistory> medicalHistory;
	
	 public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	

	@Override
	public String toString() {
		return "Child [self=" + self + ", medicalHistory=" + medicalHistory + ", chid=" + chid + ", name=" + name
				+ ", dob=" + dob + ", tob=" + tob + ", pob=" + pob + ", anniversary=" + anniversary + ", mobNumber="
				+ mobNumber + ", email=" + email + ", bloodGroup=" + bloodGroup + ", emergency=" + emergency
				+ ", organization=" + organization + ", qualification=" + qualification + "]";
	}

	public Child(Self self, Set<MedicalHistory> medicalHistory, Long chid, String name, Date dob, Double tob,
			String pob, Date anniversary, int mobNumber, String email, String bloodGroup, String emergency,
			String organization, String qualification) {
		super();
		this.self = self;
		this.medicalHistory = medicalHistory;
		this.chid = chid;
		this.name = name;
		this.dob = dob;
		this.tob = tob;
		this.pob = pob;
		this.anniversary = anniversary;
		this.mobNumber = mobNumber;
		this.email = email;
		this.bloodGroup = bloodGroup;
		this.emergency = emergency;
		this.organization = organization;
		this.qualification = qualification;
	}

	public Set<MedicalHistory> getMedicalHistory() {
		return medicalHistory;
	}

	public void setMedicalHistory(Set<MedicalHistory> medicalHistory) {
		this.medicalHistory = medicalHistory;
	}



	@Id
	    @Column(name="child_id")
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long chid;
	 
	 
	
	private String name;
	
	private Date dob;
	private Double tob;
	private String pob;
	
	private Date anniversary;
	private int mobNumber;
	
	@Size(min = 1, max = 100)
	@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
	private String email;
	
	private String bloodGroup;
	
	private String emergency;
	
	private String organization;
	
	private String qualification;

	public Long getChid() {
		return chid;
	}

	public void setChid(Long chid) {
		this.chid = chid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Double getTob() {
		return tob;
	}

	public void setTob(Double tob) {
		this.tob = tob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public Date getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}

	public int getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(int mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmergency() {
		return emergency;
	}

	public void setEmergency(String emergency) {
		this.emergency = emergency;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	

	
	
	public Child() {
		super();
		
	}

}
