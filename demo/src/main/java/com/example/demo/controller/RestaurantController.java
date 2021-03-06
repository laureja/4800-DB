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

import com.example.demo.domain.Restaurant;
import com.example.demo.domain.FormCommand;
import com.example.demo.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping(value = "/displayRestaurants", method = RequestMethod.GET)
	public String formExampleDisplay(HttpServletRequest request, Model model) {
		System.out.println("I am in displayResaurant inside Restaurant Controller");
//		
//		HttpSession session = request.getSession(true);
//		
//		String userName = session.getAttribute("user").toString();
//		
//		System.out.println("userName from Session inside displayRestaurants :"+ userName);
		
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		
		restaurantList = restaurantService.getRestaurantList();
		
		for (Restaurant r : restaurantList)
			System.out.println(r);
		
		model.addAttribute("restaurantList", restaurantList);
		
		return "displayRestaurants";
		
	}
	
	
	@RequestMapping(value = "/saveRestaurant", method = RequestMethod.POST)
	public String saveRestaurant(@ModelAttribute Restaurant restaurant, Model model) {
		
		System.out.println("I am in saveEmployee inside Restaurant Controller");
		
		System.out.println("Employee details in saveEmployee"+restaurant);
		
		restaurantService.saveRestaurant(restaurant);
		
		model.addAttribute("restaurant", restaurant);
		model.addAttribute("message","Update Successful");
		
		return "editRestaurant";
		
	}
	
	@RequestMapping(value = "/editRestaurant/{restid}", method = RequestMethod.GET)
	public String editRestaurant(@PathVariable int restid, @ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in editRestaurant inside Restaurant Controller");
		
		restaurant = new Restaurant();
		
		restaurant.setRestid(restid);
		restaurant = restaurantService.getRestaurant(restaurant);
		System.out.println(restaurant);
		
		model.addAttribute("restaurant",restaurant);
		model.addAttribute("message","Please update restaurant");
		
		return "editRestaurant";
		
	}
	
	@RequestMapping(value = "/searchRestaurants", method = RequestMethod.POST)
	public String searchRestaurant(@ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in searchRestaurant inside Restaurant Controller---->" + restaurant.getRname());
		
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList = restaurantService.searchRestaurantList(restaurant);
		System.out.println(restaurant);
		
		model.addAttribute("message","Please update restaurant");
		model.addAttribute("restaurantList", restaurantList);
		return "displayRestaurants";
		
	}
	
	@RequestMapping(value = "/homeScreen", method = RequestMethod.GET)
	public String home(@ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in homeScreen inside Restaurant Controller");
		
		//model.addAttribute("restaurant", restaurant);
		
		return "homeScreen";
		
	}
	
	
	
	@RequestMapping(value = "/reviews", method = RequestMethod.GET)
	public String viewReviews(@ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in reviews inside Restaurant Controller");
		
		//model.addAttribute("restaurant", restaurant);
		
		return "reviews";
		
	}
	
	@RequestMapping(value = "/Orders", method = RequestMethod.GET)
	public String displayOrders(@ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in Orders inside Restaurant Controller");
		
		//model.addAttribute("restaurant", restaurant);
		
		return "Orders";
		
	}
	
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String displayLogout(@ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in Logout inside Restaurant Controller");
		
		//model.addAttribute("restaurant", restaurant);
		
		return "Logout";
		
	}
}
