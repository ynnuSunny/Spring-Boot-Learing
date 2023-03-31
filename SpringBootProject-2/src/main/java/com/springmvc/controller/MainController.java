package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MainController {
	
	@RequestMapping("index")
    public String homePage() {
    	return "HomePage.html";
    }
	
	@RequestMapping("addProgrammer")
    public String programmer(@RequestParam int pId,@RequestParam String pName,@RequestParam String pLang,Model model) {
       // System.out.println(+pId+" "+pName+" "+pLang);
		model.addAttribute("pId",pId);
		model.addAttribute("pName",pName);
		model.addAttribute("pLang",pLang);
		
		return "ProgrammerInfo.html";
    }
}
