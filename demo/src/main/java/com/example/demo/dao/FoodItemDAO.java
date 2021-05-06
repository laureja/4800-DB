package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.FoodItem;

@Component
public class FoodItemDAO {
	
	@Autowired
	private FoodItemMapper foodItemMapper;
	
	public List<FoodItem> getFoodItemList() {
		List<FoodItem> foodItemList = new ArrayList<FoodItem>();
		foodItemList = foodItemMapper.getFoodItem();
		return foodItemList;
	}
	public void saveFoodItem(FoodItem foodItem) {
		foodItemMapper.saveFoodItem(foodItem);
	}
}
