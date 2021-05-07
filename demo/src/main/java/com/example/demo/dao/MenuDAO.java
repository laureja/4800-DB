package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;
@Component
public class MenuDAO {
	
	@Autowired
	private MenuMapper menuMapper;
	
	public List<Menu> getMenuList(Restaurant r) {
		List<Menu> menuList = new ArrayList<Menu>();
		menuList = menuMapper.getMenuList(r);
		return menuList;
	}
	public void saveMenu(Menu menu) {
		menuMapper.saveMenu(menu);
	}
}
