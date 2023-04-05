package com.onlineexam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.onlineexam.model.UserDtls;
import com.onlineexam.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncode;
	
	@Override
	public UserDtls createUser(UserDtls user) {
		user.setPassword(passwordEncode.encode(user.getPassword()));
		if(user.getUserType().equals("teacher")) {
			user.setRole("TEACHER");
		}else {
			user.setRole("STUDENT");
		}
		return userRepo.save(user);
	}

	@Override
	public boolean checkEmail(String email) {
		
		return userRepo.existsByEmail(email);
	}
     
	
}
