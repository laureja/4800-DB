package com.example.demo.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Menu;
@Component
public class MenuDAO {
	
	@Autowired
	private MenuMapper menuMapper;
	
	public List<Menu> getMenuList() {
		List<Menu> menuList = new ArrayList<Menu>();
		menuList = menuMapper.getMenuList();
		return menuList;
	}
	public void saveMenu(Menu menu) {
		menuMapper.saveMenu(menu);
	}
}
