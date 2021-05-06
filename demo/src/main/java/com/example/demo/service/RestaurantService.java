package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RestaurantDAO;
import com.example.demo.domain.Restaurant;

@Component
public class RestaurantService {
	
	@Autowired
	RestaurantDAO restaurantDAO;
	
	public List<Restaurant> getRestaurantList() {
		
		return restaurantDAO.getRestaurantList();
	}
	
	public Restaurant getRestaurant(Restaurant restaurant) {
		
		return restaurantDAO.getRestaurant(restaurant);
	}
	
	public void saveRestaurant(Restaurant restaurant) {
		restaurantDAO.saveRestaurant(restaurant);
	}

}
