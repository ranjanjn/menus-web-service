package com.menus.api.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.menus.api.domain.Menus;
import com.menus.api.repository.MenusRepository;
import com.menus.api.service.MenusService;

@Service
public class MenusServiceimpl implements MenusService{
	
	@Autowired
	private MenusRepository menusRepository;

	@Override
	public void createMenus(Menus menus) {
		menusRepository.save(menus);
		
	}

	@Override
	public void findMenusById(String menusId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Menus> findAllMenus() {
	   List<Menus>menusList=new ArrayList<>();
	   menusList = menusRepository.findAll();
		return menusList;
	}

	@Override
	public Menus findBymenuName(String menuName) {
		Menus menus = new Menus();
		menus = menusRepository.findBymenuName(menuName);
		return menus;
	}

}
