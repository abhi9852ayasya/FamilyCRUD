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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Spouse {
	
	@OneToOne(mappedBy = "spouse")
	private Self self;
	
    public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) 
	private Set<MedicalHistory> medicalHistory;
	
	
		 @Id
		    @Column(name="spouse_id")
		    @GeneratedValue(strategy=GenerationType.AUTO)
		    private Long spid;
		 
		
		private String spouseName;
		
		private Date spouseDob;
		private Double spouseTob;
		private String spousePob;
		
		private Date spouseAnniversary;
		private int spouseMobNumber;
		
		
		@Size(min = 1, max = 100)
		@Pattern(regexp="^([a-zA-Z0-9\\-\\.\\_]+)'+'(\\@)([a-zA-Z0-9\\-\\.]+)'+'(\\.)([a-zA-Z]{2,4})$")
		private String spouseEmail;
		
		private String spouseBloodGroup;
		
		private String spouseEmergency;
		
		private String spouseOrganization;
		
		private String spouseQualification;

		public Long getSpid() {
			return spid;
		}

		public void setSpid(Long spid) {
			this.spid = spid;
		}

		public String getSpouseName() {
			return spouseName;
		}

		public void setSpouseName(String spouseName) {
			this.spouseName = spouseName;
		}

		public Date getSpouseDob() {
			return spouseDob;
		}

		public void setSpouseDob(Date spouseDob) {
			this.spouseDob = spouseDob;
		}

		public Double getSpouseTob() {
			return spouseTob;
		}

		public void setSpouseTob(Double spouseTob) {
			this.spouseTob = spouseTob;
		}

		public String getSpousePob() {
			return spousePob;
		}

		public void setSpousePob(String spousePob) {
			this.spousePob = spousePob;
		}

		public Date getSpouseAnniversary() {
			return spouseAnniversary;
		}

		public void setSpouseAnniversary(Date spouseAnniversary) {
			this.spouseAnniversary = spouseAnniversary;
		}

		public int getSpouseMobNumber() {
			return spouseMobNumber;
		}

		public void setSpouseMobNumber(int spouseMobNumber) {
			this.spouseMobNumber = spouseMobNumber;
		}

		public String getSpouseEmail() {
			return spouseEmail;
		}

		public void setSpouseEmail(String spouseEmail) {
			this.spouseEmail = spouseEmail;
		}

		public String getSpouseBloodGroup() {
			return spouseBloodGroup;
		}

		public void setSpouseBloodGroup(String spouseBloodGroup) {
			this.spouseBloodGroup = spouseBloodGroup;
		}

		public String getSpouseEmergency() {
			return spouseEmergency;
		}

		public void setSpouseEmergency(String spouseEmergency) {
			this.spouseEmergency = spouseEmergency;
		}

		public String getSpouseOrganization() {
			return spouseOrganization;
		}

		public void setSpouseOrganization(String spouseOrganization) {
			this.spouseOrganization = spouseOrganization;
		}

		public String getSpouseQualification() {
			return spouseQualification;
		}

		public void setSpouseQualification(String spouseQualification) {
			this.spouseQualification = spouseQualification;
		}

	

		
		
		public Spouse(Self self, Set<MedicalHistory> medicalHistory, Long spid, String spouseName, Date spouseDob,
				Double spouseTob, String spousePob, Date spouseAnniversary, int spouseMobNumber, String spouseEmail,
				String spouseBloodGroup, String spouseEmergency, String spouseOrganization,
				String spouseQualification) {
			super();
			this.self = self;
			this.medicalHistory = medicalHistory;
			this.spid = spid;
			this.spouseName = spouseName;
			this.spouseDob = spouseDob;
			this.spouseTob = spouseTob;
			this.spousePob = spousePob;
			this.spouseAnniversary = spouseAnniversary;
			this.spouseMobNumber = spouseMobNumber;
			this.spouseEmail = spouseEmail;
			this.spouseBloodGroup = spouseBloodGroup;
			this.spouseEmergency = spouseEmergency;
			this.spouseOrganization = spouseOrganization;
			this.spouseQualification = spouseQualification;
		}

		public Set<MedicalHistory> getMedicalHistory() {
			return medicalHistory;
		}

		public void setMedicalHistory(Set<MedicalHistory> medicalHistory) {
			this.medicalHistory = medicalHistory;
		}

		public Spouse() {
			super();
			
		}
		
		

}
