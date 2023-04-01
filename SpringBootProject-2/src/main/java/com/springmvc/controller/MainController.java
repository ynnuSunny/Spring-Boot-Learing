package com.springmvc.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Programmer;
import com.springmvc.model.repository.ProgremmerRepo;



@Controller
public class MainController {
	
	@Autowired
	ProgremmerRepo pr;
	
	@ModelAttribute
	public void welcome(Model m) {
	   m.addAttribute("msg", "Welcome the website");
	}
	
	
	@GetMapping("index")
    public String homePage() {
    	return "HomePage.html";
    }
	
	@PostMapping(value="addProgrammer")
    public String programmer(@ModelAttribute("p") Programmer programmer) {
       // System.out.println(+pId+" "+pName+" "+pLang);
	    
		pr.save(programmer);
		
		return ("ProgrammerInfo.html");
		
		
    }
	
	@GetMapping("/allProgrammer")
	public String allProgramer(Model model) {
		List<Programmer> list = new ArrayList<Programmer>();
		
		list.add(new Programmer(80,"Foyez","C++"));
		list.add(new Programmer(84,"Sunny","Java"));
		list.add(new Programmer(63,"Xami","C"));
		model.addAttribute("programmer", list);
		model.addAttribute("obj", "Hello");
		return "AllProgrammer.html";
	}
}
