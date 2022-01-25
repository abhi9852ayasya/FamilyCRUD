package prodCrud.DAO;

import java.io.Serializable;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import prodCrud.Entity.Child;
import prodCrud.Entity.MedicalHistory;
import prodCrud.Entity.Self;
import prodCrud.Entity.Spouse;
import prodCrud.Entity.User;

@Service
public class FamilyDao implements Serializable{
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	private Self self;
	private Serializable identifier;
	private User user;
	
	
	
	
	@Transactional
	public void saveAll(Self self, Spouse spouse, Child child) {
		
	
		this.hibernateTemplate.saveOrUpdate(self);
		this.hibernateTemplate.saveOrUpdate(spouse);
		this.hibernateTemplate.saveOrUpdate(child);
	}
	
	
	
	@Transactional
	public void saveSelf(Self self ) {
		
		this.hibernateTemplate.save(self);
		
	}
	
	public void saveMedicalHistory(MedicalHistory medicalHistory) {
		identifier = this.hibernateTemplate.getSessionFactory().getCurrentSession().getIdentifier(self);
		
	}
	
	
	public List<Self> getAllSelf(){
		List<Self> loadAll = this.hibernateTemplate.loadAll(Self.class);
		return loadAll;
		}


	public Self getSingleSelf(int sid) {
		return this.hibernateTemplate.get(Self.class, sid);
	}
	
	//delete single member
	

}
