package com.menus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.menus.api.domain.Menus;
import com.menus.api.service.MenusService;

@RestController
@RequestMapping("/menus")
public class MenusController {
	
	@Autowired
	private MenusService menusService;
	
	@PostMapping("/create")
	public void createMenus(@RequestBody Menus menus) {
		menusService.createMenus(menus);
		
	}
	
	@GetMapping("/findAll")
	public List<Menus> findAllMenus(){
		List<Menus>menusList=menusService.findAllMenus();
		return menusList;
	}
	
	@GetMapping("/findBymenuName/{menuName}")
	public Menus findBymenuName(@PathVariable String menuName) {
		return menusService.findBymenuName(menuName);
	
		
	}

}
