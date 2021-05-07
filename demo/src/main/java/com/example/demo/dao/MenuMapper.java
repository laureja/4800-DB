package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;

@Mapper
public interface MenuMapper {
	
	@Select("SELECT RESTID,FOODNAME,PRICE FROM MENU WHERE RESTID=#{restid}")
	List<Menu> getMenuList(Restaurant restaurant);
	
	@Update("update MENU set price=#{price} where restid=#{restid} AND foodname=#{foodname}")
	void saveMenu(Menu menu);
	
	@Insert("insert Menu (restid,foodname,price) values(#{restid},#{foodname},#{price})")
	void InsertMenu(Menu menu);
	
	

}
