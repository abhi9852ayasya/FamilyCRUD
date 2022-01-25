package prodCrud.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import prodCrud.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

		
	User findByUsername(String userName);
}
