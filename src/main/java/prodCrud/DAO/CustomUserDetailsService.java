package prodCrud.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import prodCrud.Entity.User;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private RegistrationLoginServices reglogin;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
