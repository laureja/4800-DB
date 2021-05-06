package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.FoodItemDAO;
import com.example.demo.domain.FoodItem;

@Component
public class FoodItemService {
	
	@Autowired
	FoodItemDAO foodItemDAO;
	
	public List<FoodItem> getFoodItemList() {
		return foodItemDAO.getFoodItemList();
	}
	public void saveFoodItemService(FoodItem foodItem) {
		foodItemDAO.saveFoodItem(foodItem);
	}
	
}
