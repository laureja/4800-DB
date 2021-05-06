package com.example.demo.dao;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Cuisine;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.Review;

@Component
public class CuisineDAO {

	@Autowired
	private CuisineMapper cuisineMapper;
	
	public List<Cuisine> getCuisineList(){
		
		List<Cuisine> cuisineList = new ArrayList<Cuisine>();
		cuisineList = cuisineMapper.getCuisineList();
		return cuisineList;
	}
}
