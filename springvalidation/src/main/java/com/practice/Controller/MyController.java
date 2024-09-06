package com.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.Entity.User;

@Controller
public class MyController {
	
	
	@GetMapping("/form")
	public String openform(Model m) {
		System.out.println("Calling form...........");
		m.addAttribute("loginData", new User());
		return "form";
	}
	
	@PostMapping("/login")
    public String processLogin(User user) {
        // Process the login (e.g., authenticate the user)
        // Redirect or return a view based on login success
        return "redirect:/home";  // Example: redirect to the home page
    }
	

}
