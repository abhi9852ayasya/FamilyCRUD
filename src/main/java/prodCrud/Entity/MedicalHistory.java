package prodCrud.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class MedicalHistory implements Serializable{
	
	 @Id
	    @Column(name="medical_id")
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long medicalId;
	 
	
	 @ManyToOne
	 private Self self;
	 
	 
	 @ManyToOne
	 private Spouse spouse;
	 
	 @ManyToOne
	 private Child child;
	 
	
	public Self getSelf() {
		return self;
	}

	public void setSelf(Self self) {
		this.self = self;
	}

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	private String vaccName;
	
	private Date vaccDate;
	
	private String allergicMedicines;
	
	private String metallicImplant;
	
	private String lifeSaveMed;

	public Long getMedicalId() {
		return medicalId;
	}

	public void setMedicalId(Long medicalId) {
		this.medicalId = medicalId;
	}

	public String getVaccName() {
		return vaccName;
	}

	public void setVaccName(String vaccName) {
		this.vaccName = vaccName;
	}

	public Date getVaccDate() {
		return vaccDate;
	}

	public void setVaccDate(Date vaccDate) {
		this.vaccDate = vaccDate;
	}

	public String getAllergicMedicines() {
		return allergicMedicines;
	}

	public void setAllergicMedicines(String allergicMedicines) {
		this.allergicMedicines = allergicMedicines;
	}

	public String getMetallicImplant() {
		return metallicImplant;
	}

	public void setMetallicImplant(String metallicImplant) {
		this.metallicImplant = metallicImplant;
	}

	public String getLifeSaveMed() {
		return lifeSaveMed;
	}

	public void setLifeSaveMed(String lifeSaveMed) {
		this.lifeSaveMed = lifeSaveMed;
	}

	

	public MedicalHistory(Long medicalId, Self self, Spouse spouse, Child child, String vaccName, Date vaccDate,
			String allergicMedicines, String metallicImplant, String lifeSaveMed) {
		super();
		this.medicalId = medicalId;
		this.self = self;
		this.spouse = spouse;
		this.child = child;
		this.vaccName = vaccName;
		this.vaccDate = vaccDate;
		this.allergicMedicines = allergicMedicines;
		this.metallicImplant = metallicImplant;
		this.lifeSaveMed = lifeSaveMed;
	}

	public MedicalHistory() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MedicalHistory [medicalId=" + medicalId + ", vaccName=" + vaccName + ", vaccDate=" + vaccDate
				+ ", allergicMedicines=" + allergicMedicines + ", metallicImplant=" + metallicImplant + ", lifeSaveMed="
				+ lifeSaveMed + "]";
	}
	
	
	
	
	
	
	

}
