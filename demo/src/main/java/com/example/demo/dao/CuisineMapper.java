package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Cuisine;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.Review;

@Mapper
public interface CuisineMapper {
	
	@Select("SELECT RESTID, CNAME FROM REST_CUISINE")
	List<Cuisine> getCuisineList();
	
}
