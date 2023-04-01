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
	
	@GetMapping("index")
    public String homePage() {
    	return "HomePage.html";
    }
	
	@PostMapping(value="addProgrammer")
    public String programmer(@ModelAttribute("p") Programmer programmer) {
       // System.out.println(+pId+" "+pName+" "+pLang);
	    
		pr.save(programmer);
		
		return "redirect:/index";
		
    }
	
	@PostMapping(value="/findById")
	public String findById(@RequestParam int pId,Model m){
		//view or read data one from database
		Programmer p = pr.getOne(pId);
		m.addAttribute("p",p);
		return "programmerInfo.html";
	}
	
	@GetMapping(value="/deleteById")
	public String deleteById(@RequestParam int pId, Model m) {
		//delete by id
		pr.deleteById(pId);
		return "redirect:/index";
	}
	@PostMapping(value="/updateProgrammer")
	public String updateProgrammer(@ModelAttribute("p") Programmer programmer) {
		Programmer p = pr.getOne(programmer.getpId());
		p.setpName(programmer.pName);
		p.setpLang(programmer.getpLang());
		pr.save(p);
		
		return "programmerInfo.html";
	}
	
}
