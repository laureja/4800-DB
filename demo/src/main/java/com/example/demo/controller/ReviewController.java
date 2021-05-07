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

import com.example.demo.domain.Review;
import com.example.demo.domain.Review;
import com.example.demo.domain.FormCommand;
import com.example.demo.domain.Restaurant;
import com.example.demo.service.RestaurantService;
import com.example.demo.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@Autowired
	RestaurantService restaurantService;
	
	@RequestMapping(value = "/ReviewRestaurants", method = RequestMethod.GET)
	public String formExampleDisplay(HttpServletRequest request, Model model) {
		System.out.println("I am in displayResaurant inside Review Controller");
		
//		HttpSession session = request.getSession(true);
//		String userName = session.getAttribute("user").toString();
//		

		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		
		restaurantList = restaurantService.getRestaurantList();
		
		for (Restaurant r : restaurantList)
			System.out.println(r);
		
		model.addAttribute("restaurantList", restaurantList);
		
		return "ReviewRestaurants";
		
	}
	
	@RequestMapping(value = "/createReviewPost", method = RequestMethod.POST)
	public String createReview(@ModelAttribute Review review, Model model) {
		
		System.out.println("I am in saveReview inside Review Controller");
		
		System.out.println("Employee details in saveEmployee"+review);
		
		reviewService.insertReview(review);
		
		model.addAttribute("review", review);
		model.addAttribute("message","Update Successful");
		
		return "createReview";
		
	}
	
	@RequestMapping(value = "/createFormReview/{restid}", method = RequestMethod.GET)
	public String saveReview(@PathVariable int restid, @ModelAttribute Review review, Model model) {
		
		System.out.println("I am in saveReview inside Review Controller");
		
		System.out.println("Employee details in saveEmployee"+review);
		
		review.setRestid(restid);
		//model.addAttribute("restid",restid);
		
		model.addAttribute("review", review);
		model.addAttribute("message","On creating");
		
		return "createReview";
		
	}
	
	@RequestMapping(value = "/displayReviews/{restid}", method = RequestMethod.GET)
	public String editRestaurant(HttpServletRequest request, @PathVariable int restid, @ModelAttribute Review review, @ModelAttribute Restaurant restaurant, Model model) {
		System.out.println("I am in editRestaurant inside Restaurant Controller");
		
		
		review = new Review();
		
		restaurant = new Restaurant();
		restaurant.setRestid(restid);
		
		restaurant = restaurantService.getRestaurant(restaurant);
		
		
		
		
		review.setRestid(restid);

		List<Review> reviewList = new ArrayList<Review>();

		reviewList = reviewService.getReviewList(review);

		for (Review r : reviewList)
		System.out.println(r);

		model.addAttribute("reviewList", reviewList);
		model.addAttribute("restaurant", restaurant);

		
		model.addAttribute("review",review);
		model.addAttribute("message","Please update restaurant");
		
		return "displayReviews";
		
	}
	
	
	
	
	
}
