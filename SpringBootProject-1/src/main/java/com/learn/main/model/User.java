package com.learn.main.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Autowired
    Verification v;
    
    public void checkUser() {
    	v.isVerfied();
    }
}
