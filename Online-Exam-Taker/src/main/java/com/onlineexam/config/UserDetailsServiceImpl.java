package com.onlineexam.config;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.onlineexam.model.UserDtls;
import com.onlineexam.repository.UserRepository;


@Service
public class UserDetailsServiceImpl implements UserDetailsService{
    
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
	   UserDtls user =userRepo.findByEmail(email);
		  
	   if(user!=null) {
		   return new CustomUserDetails(user);
	   }else {
		   throw new UsernameNotFoundException("User is not available");	   
	   }
		
	}

	
}
