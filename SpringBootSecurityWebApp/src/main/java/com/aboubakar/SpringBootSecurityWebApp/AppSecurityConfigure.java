/**
 * 
 */
package com.aboubakar.SpringBootSecurityWebApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author Aboubakar
 *
 */

@Configuration
@EnableWebSecurity
public class AppSecurityConfigure extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	@Bean
	public AuthenticationProvider authProvider() {
	
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		
		return provider;
	}
	
	
//	@Bean
//	@Override
//	protected UserDetailsService userDetailsService() {
//		
//		List<UserDetails> users = new ArrayList();
//		
//		users.add((UserDetails) User.withDefaultPasswordEncoder().username("aboubakar")
//				.password("abou2").roles("ADMIN").build());
//		
//		return new InMemoryUserDetailsManager(users);
//	}

	
}
