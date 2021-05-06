package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CuisineDAO;
import com.example.demo.dao.RestaurantDAO;
import com.example.demo.dao.ReviewDAO;
import com.example.demo.domain.Cuisine;
import com.example.demo.domain.Review;

@Component
public class CuisineService {
	
	@Autowired
	CuisineDAO cuisineDAO;
	
	public List<Cuisine> getCuisineList() {
		
		return cuisineDAO.getCuisineList();
	}

}
