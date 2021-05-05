package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.FormCommand;
import com.example.demo.domain.User;

@Controller
public class GreetingController {

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		// System.out.println("I am in greeting controller");
		model.addAttribute("name", name);
		return "greeting";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String userLogin(HttpServletRequest request, @ModelAttribute User user, Model model) {

		String viewPage = "userLogin", message = "Please enter user name and password :";

		model.addAttribute("user", user);
		model.addAttribute("message", message);

		return viewPage;
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	public String inputExamplePost(HttpServletRequest request, @ModelAttribute User user, Model model) {

		String viewPage = "", message = "";

		System.out.println("User Details :" + user);
		String userName = user.getUserName();
		String password = user.getPassword();
		
		HttpSession session = request.getSession(true);
		
		

		if (userName.equals("dbcourse")) {
			if (password.equals("ilovedatabase")) {	
				
				session.setAttribute("user", userName);
				
				viewPage = "loginResults";
			} else {
				session.invalidate();
				message = "invalid password";
				viewPage = "userLogin";
				user = new User();
			}
		} else {
			session.invalidate();
			viewPage = "userLogin";
			message = "wrong username";
			user = new User();
		}

		model.addAttribute("user", user);
		model.addAttribute("message", message);

		return viewPage;
	}

	// older way of reading values from request object
	/*
	 * @RequestMapping(value = "/userLogin", method = RequestMethod.POST) public
	 * String userLogin(HttpServletRequest request,Model model) {
	 * System.out.println("I am in userlogin method inside greeting controller");
	 * 
	 * String userName = request.getParameter("userName"); String password =
	 * request.getParameter("password");
	 * 
	 * 
	 * model.addAttribute("userName", userName ); model.addAttribute("password",
	 * password );
	 * 
	 * 
	 * return "userLogin"; }
	 */

	@RequestMapping(value = "/formExample", method = RequestMethod.POST)
	public String formExampleSubmission(@ModelAttribute FormCommand formCommand, Model model) {
		System.out.println("I am in formExample method inside greeting controller");

		// formCommand = new FormCommand();

		model.addAttribute("formCommand", formCommand);
		return "formResults";
	}

	@RequestMapping(value = "/formExample", method = RequestMethod.GET)
	public String formExampleDisplay(@ModelAttribute FormCommand formCommand, Model model) {
		System.out.println("I am in formExample display method inside greeting controller");
		formCommand = new FormCommand();
		// formCommand.setMultiCheckboxAllValues(getMultiCheckboxAllValues());
		model.addAttribute("formCommand", formCommand);
		model.addAttribute("multiCheckboxAllValues", getMultiCheckboxAllValues());

		model.addAttribute("singleSelectAllValues", getSingleSelectAllValues());

		return "formExample";
	}

	private List<String> getSingleSelectAllValues() {
		List<String> singleSelectAllValues = new ArrayList<String>();
		singleSelectAllValues.add("Yes");
		singleSelectAllValues.add("No");
		singleSelectAllValues.add("Maybe");

		return singleSelectAllValues;
	}

	private String[] getMultiCheckboxAllValues() {

		String[] toReturn = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

		return toReturn;
	}

}