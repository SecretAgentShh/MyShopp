package com.example.myjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.myjava.model.PasswordChange;
import com.example.myjava.service.Myservice;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerBoss {

	private final Myservice serv;
	
	@Autowired
	public ControllerBoss(Myservice service)
	{
		this.serv = service;
	};
	
    // Simple GET mapping
    @GetMapping("pchange/greet")
    public String getGreeting(Model m) {
    	m.addAttribute("message","Alrighty, the site is up n running");
        return "homepage"; //returns thymeleaf template page
    }
    
    @GetMapping("pchange/page2")
    public ModelAndView page2(
    		@RequestParam(name = "name", required = false)String name,
    		@RequestParam(name = "pword", required = false)String pword)
    {
    	ModelAndView mav = new ModelAndView("page2");
    	return mav;
    }
    
    
    @PostMapping()
    public ResponseEntity<PasswordChange> createDocument(@RequestBody PasswordChange pc) {
    	PasswordChange savedpc = serv.savedoc(pc);
        return new ResponseEntity<>(savedpc, HttpStatus.CREATED);
    }
    
    

    @GetMapping("/error")
    public String errorpg() {
    	return "OOPS, you need to learn your oops well. Come back and don't run into this page again!";
    }
   
}
