package com.example.myjava.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControllerBoss {

	private String message = "Hello Human! ";
    // Simple GET mapping
    @GetMapping("/greet")
    public String getGreeting(Model model) {
    	model.addAttribute("message",message);
        return "homepage"; //returns thymeleaf template page
    }
    
  //  @GetMapping("/greet/two")
  //  public String gpagetwo(Model m) {
    //	m.addAttribute("message",message);
      //  return "page2";
    //}
    
    

    @GetMapping("/error")
    public String errorpg() {
    	return "OOPS, you need to learn your oops well. Come back and don't run into this page again!";
    }
   
}
