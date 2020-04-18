/**
 * 
 */
package com.aboubakar.SpringBootSecurityWebApp;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Aboubakar
 *
 */
public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByUsername(String usename);

}
