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

import com.example.demo.domain.Menu;
import com.example.demo.domain.Order;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.Review;
import com.example.demo.domain.FormCommand;
import com.example.demo.service.MenuService;
import com.example.demo.service.RestaurantService;

@Controller
public class MenuController {
	
	@Autowired 
	MenuService menuService;
	
	@Autowired 
	RestaurantService restaurantService;
	
	@RequestMapping(value = "/displayMenu/{restid}", method = RequestMethod.GET)
	public String editRestaurant(@PathVariable int restid, @ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in editRestaurant inside Restaurant Controller");
		
		restaurant = new Restaurant();
		List<Menu> menuList = new ArrayList<Menu>();
		restaurant.setRestid(restid);
		menuList = menuService.getMenuList(restaurant);
		System.out.println(restaurant);
		
		model.addAttribute("restaurant",restaurant);
		model.addAttribute("menuList",menuList);
		model.addAttribute("message","Please update restaurant");
		
		return "displayMenus";
		
	}
	
	@RequestMapping(value = "/orderRestaurants", method = RequestMethod.GET)
	public String formExampleDisplay(HttpServletRequest request, Model model) {
		System.out.println("I am in displayResaurant inside Restaurant Controller");
		
////		HttpSession session = request.getSession(true);
////		
////		String userName = session.getAttribute("user").toString();
////		
//		System.out.println("userName from Session inside displayRestaurants :"+ userName);

		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		
		restaurantList = restaurantService.getRestaurantList();
		
		for (Restaurant r : restaurantList)
			System.out.println(r);
		
		model.addAttribute("restaurantList", restaurantList);
		
		return "orderRestaurants";
		
	}
	
	@RequestMapping(value = "/createOrder/{restid}", method = RequestMethod.GET)
	public String saveReview(@ModelAttribute FormCommand formCommand, @PathVariable int restid,  Model model) {
		
		System.out.println("I am in saveReview inside Review Controller");
		formCommand = new FormCommand();
		model.addAttribute("formCommand", formCommand);
		
	
		Restaurant restaurant = new Restaurant();
		
		List<Menu> menuList = new ArrayList<Menu>();
		restaurant.setRestid(restid);
		menuList = menuService.getMenuList(restaurant);
		
		
		
		restaurantService.getRestaurant(restaurant);
		Order order = new Order();
		
		System.out.println("Whyyyy"+ getSingleSelectAllValues());
		model.addAttribute("singleSelectAllValues", getSingleSelectAllValues());
		model.addAttribute("menuList", menuList);
		model.addAttribute("restaurant", restaurant);
		model.addAttribute("message","On creating");
		
		return "createOrder";
		
	}
	
	@RequestMapping(value = "/createOrderPost", method = RequestMethod.POST)
	public String createReview(@ModelAttribute Review review, Model model) {
		
		System.out.println("I am in saveReview inside Review Controller");
		
		System.out.println("Employee details in saveEmployee"+review);
		
		
		model.addAttribute("review", review);
		model.addAttribute("message","Update Successful");
		
		return "createReview";
		
	}
	
	private List<Integer> getSingleSelectAllValues() {
		List<Integer> singleSelectAllValues = new ArrayList<Integer>();
		singleSelectAllValues.add(1);
		singleSelectAllValues.add(2);
		singleSelectAllValues.add(3);
		singleSelectAllValues.add(4);
		singleSelectAllValues.add(5);
		singleSelectAllValues.add(6);
		singleSelectAllValues.add(7);
		singleSelectAllValues.add(8);
		singleSelectAllValues.add(9);
		singleSelectAllValues.add(10);
		singleSelectAllValues.add(50);
		singleSelectAllValues.add(100);
		

		return singleSelectAllValues;
	}
	
	
}
