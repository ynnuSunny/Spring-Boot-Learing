package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Programmer;



@Controller
public class MainController {
	
	@ModelAttribute
	public void welcome(Model m) {
	   m.addAttribute("msg", "Welcome the website");
	}
	
	
	@RequestMapping("index")
    public String homePage() {
    	return "HomePage.html";
    }
	
	@RequestMapping(value="addProgrammer",method=RequestMethod.POST)
    public String programmer(@ModelAttribute("p") Programmer programmer) {
       // System.out.println(+pId+" "+pName+" "+pLang);
	    
		
		return ("ProgrammerInfo.html");
		
		
    }
}
