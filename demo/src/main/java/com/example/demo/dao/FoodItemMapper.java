package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.FoodItem;

@Mapper
public interface FoodItemMapper {
	
	@Select("SELECT FOODNAME,FCATNAME FROM FOOD_ITEM")
	List<FoodItem> getFoodItem();
	
	@Update("update FOOD_ITEM set fcatname=#{fcatname} where foodname=#{foodname}")
	void saveFoodItem(FoodItem foodItem);
	
	
	
}
