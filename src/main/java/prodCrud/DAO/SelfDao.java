package prodCrud.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import prodCrud.Entity.Self;

@Service
public class SelfDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	@Transactional
	public void saveSelf(Self self) {
		
		this.hibernateTemplate.save(self);
	}
	
	//to get all Family
	
	public List<Self> getAllMembers(){
	List<Self> loadAll = this.hibernateTemplate.loadAll(Self.class);
	return loadAll;
	}
	
	//delete single member
	

	@Transactional
	public void deleteMember(int sid) {
		Self s = this.hibernateTemplate.load(Self.class, sid);
		this.hibernateTemplate.delete(s);
		
	}
	
	//to get single Member
	public Self getSingleMember(int sid) {
		return this.hibernateTemplate.get(Self.class, sid);
	}
	
	//delete all Family
	@Transactional
	public void deleteMultiMembers(Self self) {
		this.hibernateTemplate.delete(self);
		
		
	}
	
	
	

}
