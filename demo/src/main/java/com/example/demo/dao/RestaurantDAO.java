package com.example.demo.dao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Restaurant;

@Component
public class RestaurantDAO {

	@Autowired
	private RestaurantMapper restaurantMapper;
	
	public List<Restaurant> getRestaurantList(){
		
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantList = restaurantMapper.getRestaurantList();
		return restaurantList;
	}
	
	public void saveRestaurant(Restaurant restaurant) {
		restaurantMapper.saveRestaurant(restaurant);
	}
}
