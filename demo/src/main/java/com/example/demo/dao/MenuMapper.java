package com.example.demo.dao;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.domain.Menu;

@Mapper
public interface MenuMapper {
	
	@Select("SELECT RESTID,FOODNAME,PRICE FROM MENU")
	List<Menu> getMenuList();
	
	@Update("update MENU set price=#{price} where restid=#{restid} AND foodname=#{foodname}")
	void saveMenu(Menu menu);
	
	@Insert("insert Menu (restid,foodname,price) values(#{restid},#{foodname),#{price})")
	void insertMenu(Menu menu);
	
	

}
