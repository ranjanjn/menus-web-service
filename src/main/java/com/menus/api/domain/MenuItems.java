package com.menus.api.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="menuitems")
public class MenuItems {
	
	@Id
	private String menuItemId;
	
	private String menuItemName;
	private String otherDetails;
	
	
	@JsonBackReference("menus-menuitems")
	@ManyToOne
	@JoinColumn(name="menu_id")
	private Menus menus;
	
	
	public MenuItems() {
		
	}


	public MenuItems(String menuItemId, String menuItemName, String otherDetails, Menus menus) {
		super();
		this.menuItemId = menuItemId;
		this.menuItemName = menuItemName;
		this.otherDetails = otherDetails;
		this.menus = menus;
	}


	public String getMenuItemId() {
		return menuItemId;
	}


	public void setMenuItemId(String menuItemId) {
		this.menuItemId = menuItemId;
	}


	public String getMenuItemName() {
		return menuItemName;
	}


	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}


	public String getOtherDetails() {
		return otherDetails;
	}


	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}


	public Menus getMenus() {
		return menus;
	}


	public void setMenus(Menus menus) {
		this.menus = menus;
	}


	@Override
	public String toString() {
		return "MenuItems [menuItemId=" + menuItemId + ", menuItemName=" + menuItemName + ", otherDetails="
				+ otherDetails + ", menus=" + menus + "]";
	}
	
 
}
