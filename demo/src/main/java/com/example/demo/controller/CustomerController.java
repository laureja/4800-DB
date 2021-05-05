package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Customer;
import com.example.demo.domain.FormCommand;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.User;
import com.example.demo.service.CustomerService;


@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "/displayCustomers", method = RequestMethod.GET)
	public String formExampleDisplay(HttpServletRequest request, Model model) {
		System.out.println("I am in displayCustomer inside Customer Controller");
		
		HttpSession session = request.getSession(true);
		
		String userName = session.getAttribute("user").toString();
		
		System.out.println("userName from Session inside displayRestaurants :"+ userName);

		List<Customer> customerList = new ArrayList<Customer>();
		
		customerList = customerService.getCustomerList();
		
		for (Customer c : customerList)
			System.out.println(c);
		
		model.addAttribute("customerList", customerList);
		
		return "displayCustomers";
		
	}
	
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Customer customer, Model model) {
		
		System.out.println("I am in saveCustomer inside Customer Controller");
		
		System.out.println("Customer details in saveCustomer"+customer);
		
		customerService.saveCustomer(customer);
		
		model.addAttribute("customer", customer);
		model.addAttribute("message","Update Successful");
		
		return "editCustomer";
		
	}
	
	@RequestMapping(value = "/editCustomer/{email}", method = RequestMethod.GET)
	public String editCustomer(@PathVariable String email, @ModelAttribute Customer customer, Model model) {
		System.out.println("I am in editCustomer inside Customer Controller");
		
		customer = new Customer();
		
		customer.setEmail(email);
		model.addAttribute("customer",customer);
		model.addAttribute("message","Please update customer");
		
		return "editCustomer";
		
	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String userLogin(HttpServletRequest request, @ModelAttribute Customer customer, Model model) {

		String viewPage = "login", message = "Please enter email and password :";

		model.addAttribute("Customer", customer);
		model.addAttribute("message", message);

		return "login";
	}

}
