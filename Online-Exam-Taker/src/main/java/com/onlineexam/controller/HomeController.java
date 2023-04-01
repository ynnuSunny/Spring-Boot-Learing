package com.onlineexam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlineexam.model.UserDtls;
import com.onlineexam.service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
    
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute UserDtls user, HttpSession session) {
	    //System.out.println(user);
		boolean f = userService.checkEmail(user.getEmail());
		if(f) {
			session.setAttribute("msg", "Email Id is Used");
			//System.out.println("User Already Exist");
		}else {
			UserDtls u = userService.createUser(user);
			if(u!=null) {
				session.setAttribute("msg", "Register Successfully");
				//System.out.println("Register Successfully ");
			}else {
				session.setAttribute("msg", "Something Worng On Server");
				//System.out.println("Something Worng On Server");
			}	
		}
		return "redirect:/register";
		
	}
//	public String createUser(@RequestParam String fullName,@RequestParam String email,@RequestParam String userType, @RequestParam String password) {
//	    System.out.println(fullName);
//		//userService.createUser(user);
//		return "register";
//	}
}
