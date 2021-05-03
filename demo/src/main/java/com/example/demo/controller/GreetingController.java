package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

//	@GetMapping("/greeting")
//	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//		System.out.println("Test");
//		
//		model.addAttribute("name", name);
//		return "greeting";
//	}
	
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		System.out.println("Test");
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String userLogin(HttpServletRequest request, Model model) {
		System.out.println("I am in user Login controller");
		String username = request.getParameter("uname");
		String password = request.getParameter("pword");
		model.addAttribute("Username", username );
		model.addAttribute("Password", password );
		return "userLogin";
	}

}