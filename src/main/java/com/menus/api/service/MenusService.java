package com.menus.api.service;

import java.util.List;

import com.menus.api.domain.Menus;

public interface MenusService {
	
	
	public void createMenus(Menus menus);
	
	public void findMenusById(String menusId);
	
	public List<Menus>findAllMenus();
	
	public Menus findBymenuName (String menuName);
	
	

}
