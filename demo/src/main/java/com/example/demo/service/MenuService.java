package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MenuDAO;
import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;

@Component
public class MenuService {
	
	@Autowired
	MenuDAO menuDAO;
	
	public List<Menu> getMenuList(Restaurant r) {
		return menuDAO.getMenuList(r);
	}
	public void saveMenu(Menu menu) {
		menuDAO.saveMenu(menu);
	}
}
