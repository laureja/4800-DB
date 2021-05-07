package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Menu;
import com.example.demo.domain.Order;
import com.example.demo.domain.OrderDetails;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.Review;
import com.example.demo.domain.menuForm;
import com.example.demo.domain.FormCommand;
import com.example.demo.service.MenuService;
import com.example.demo.service.OrderService;
import com.example.demo.service.RestaurantService;

@Controller
public class MenuController {
	
	@Autowired 
	MenuService menuService;
	
	@Autowired 
	RestaurantService restaurantService;
	
	@Autowired 
	OrderService orderService;
	
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
		


		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		
		restaurantList = restaurantService.getRestaurantList();
		
		for (Restaurant r : restaurantList)
			System.out.println(r);
		
		model.addAttribute("restaurantList", restaurantList);
		
		return "orderRestaurants";
		
	}
	
	@RequestMapping(value = "/createOrder/{restid}", method = RequestMethod.GET)
	public String saveReview(@PathVariable int restid,  Model model) {
		
		System.out.println("I am in saveReview inside Review Controller");
		menuForm orderForm = new menuForm();
		model.addAttribute("menuForm", orderForm);
		
		FormCommand formCommand = new FormCommand();
		model.addAttribute("formCommand",formCommand);
	
		Restaurant restaurant = new Restaurant();
		
		List<Menu> menuList = new ArrayList<Menu>();
		restaurant.setRestid(restid);
		menuList = menuService.getMenuList(restaurant);
		
		
		orderForm.setMenu(menuList); 
		
		for (int i = 0; i <= menuList.size() - 1; i++) {
			
			
			System.out.println(menuList.get(i).getFoodname());
			OrderDetails o = new OrderDetails();
			o.setFoodname(menuList.get(i).getFoodname());
			o.setRestid(restid);
			orderForm.addItem(o);
		}
		
		System.out.println(orderForm.getOrderDetailsList());
		
		restaurantService.getRestaurant(restaurant);
		
		System.out.println("Whyyyy"+ getSingleSelectAllValues());
		model.addAttribute("singleSelectAllValues", getSingleSelectAllValues());
		model.addAttribute("flags", getFlags());
		model.addAttribute("menuList", menuList);
		model.addAttribute("restaurant", restaurant);
		model.addAttribute("message","On creating");
		
		return "createOrder";
		
	}
	
	@PostMapping(value = "/createOrderPost")
	public String createReview(HttpServletRequest request,@ModelAttribute menuForm orderForm,@ModelAttribute Restaurant restaurant, Model model) {
		
		HttpSession session = request.getSession(true);
		
		String email = session.getAttribute("email").toString();
		
		System.out.println("userName from Session inside displayRestaurants :"+ email);
		
		
		Random rd = new Random();
		int orderNum = rd.nextInt();
		Order order = new Order();
		order.setOno(orderNum);
		if (orderForm.getFlag().equals("Pick-up"))
		{
			order.setOrderpickupflag('Y');
			order.setOrderdeliveryflag('N');
			order.setOrderdineinflag('N');
		}
		System.out.println("delivery flag" + orderForm.getFlag());
		if (orderForm.getFlag().equals("Delivery"))
		{
			order.setOrderdeliveryflag('Y');
			order.setOrderpickupflag('N');
			order.setOrderdineinflag('N');
		}
		if (orderForm.getFlag().equals("Dine-in"))
		{
			order.setOrderdineinflag('Y');
			order.setOrderdeliveryflag('N');
			order.setOrderpickupflag('N');
		}
		order.setCustemail(email);
		System.out.println("ORDER::" + order + "Form" + orderForm);
		orderService.insertOrder(order);
		for (int i = 0; i < orderForm.getOrderDetailsList().size() - 1; i++)
		{
			orderForm.getOrderDetailsList().get(i).setOno(orderNum);
			
			if(orderForm.getOrderDetailsList().get(i).getQty() != 0) {
				orderService.insertOrderDetail(orderForm.getOrderDetailsList().get(i));
			}
			
		}
		System.out.println("I am in saveReview inside Review Controller");
		
		System.out.println("Employee details in saveEmployee"+orderForm);
		
		model.addAttribute("restaurant", restaurant);
		model.addAttribute("menuForm", orderForm);
		model.addAttribute("message","Update Successful");
		
		return "homeScreen";
		
	}
	
	private List<Integer> getSingleSelectAllValues() {
		List<Integer> singleSelectAllValues = new ArrayList<Integer>();
		singleSelectAllValues.add(0);
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
	
	private List<String> getFlags() {
		List<String> flags = new ArrayList<String>();
		flags.add("Delivery");
		flags.add("Dine-in");
		flags.add("Pick-up");

		return flags;
	}
	
	
}
