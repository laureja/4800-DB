package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MenuDAO;
import com.example.demo.domain.Menu;

@Component
public class MenuService {
	
	@Autowired
	MenuDAO menuDAO;
	
	public List<Menu> getMenuList() {
		return menuDAO.getMenuList();
	}
	public void saveMenu(Menu menu) {
		menuDAO.saveMenu(menu);
	}
}
