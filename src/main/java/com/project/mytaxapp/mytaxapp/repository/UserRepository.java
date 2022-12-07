package com.project.mytaxapp.mytaxapp.repository;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.project.mytaxapp.mytaxapp.models.User;
public interface UserRepository extends JpaRepository<User, Long>{
	
	 	Optional<User> findByEmail(String email);
	    Optional<User> findByMobile(String mobile);
	

}
