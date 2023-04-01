package com.onlineexam.service;

import com.onlineexam.model.UserDtls;

public interface UserService {
	public UserDtls createUser(UserDtls user);
	public boolean checkEmail(String email);
}
