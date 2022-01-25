package prodCrud.DAO;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import prodCrud.Entity.Login;
import prodCrud.Entity.Self;
import prodCrud.Entity.User;

@Service
public class RegistrationLoginServices  implements Serializable{
	
	


	@Autowired
	private HibernateTemplate hibernateTemplate;
	private User user;
	private JdbcTemplate jdbcTemplate;

	
	
	private UserRepository userRepo;
	
	

  
	
	
	@Transactional
	public void register(User user) {
		this.hibernateTemplate.save(user);
	}
	
	public List<User> getFieldsUser(){
		
		List<User> loadAll = this.hibernateTemplate.loadAll(User.class);
		System.out.println("Load user"+ loadAll);
		return loadAll;
		}
	
	public List<Login> getFieldsLogin(){
	
	List<Login> loadAll = this.hibernateTemplate.loadAll(Login.class);
	return loadAll;
	
	}
	
	@Transactional
	public void saveLog(Login login1) {
		this.hibernateTemplate.save(login1);
	}


public List<User> userName(){
	List<User> all = this.hibernateTemplate.loadAll(User.class);
	System.out.println("Username"+ all);
	
	
	return all;
	
}
  
/*
 * public User findByUserName(String userName) {
 * 
 * this.hibernateTemplate.find return userRepo.findByUsername(userName); }
 */
    
    
    public User getSingleUser(long uId) {
		return this.hibernateTemplate.get(User.class, uId);
	}
    
    public List<User> getUserNames(String userName) {
     String query= "FROM User where userName = '"+userName +"'";
    	
    	return (List<User>) this.hibernateTemplate.find(query);
    
    	
    }

  }

  
  
 
  
  

