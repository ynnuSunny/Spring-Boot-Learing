package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Programmer;



@Controller
public class MainController {
	
	@RequestMapping("index")
    public String homePage() {
    	return "HomePage.html";
    }
	
	@RequestMapping("addProgrammer")
    public ModelAndView programmer(@ModelAttribute Programmer programmer) {
       // System.out.println(+pId+" "+pName+" "+pLang);
	    
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ProgrammerInfo.html");
		
		return mv;
    }
}
