package com.menus.api.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="menus")
public class Menus {
	
	@Id
	private String menuId;
	
	private String menuName;
	private String availableDateFrom;
	private String availableDateTo;
	private String otherDetails;
	
	@JsonManagedReference("menus-menuitems")
	@OneToMany(mappedBy = "menus",cascade = CascadeType.ALL)
	List<MenuItems>menuItemsList=new ArrayList<>();

	
	public Menus() {
		
	}


	public Menus(String menuId, String menuName, String availableDateFrom, String availableDateTo, String otherDetails,
			List<MenuItems> menuItemsList) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.availableDateFrom = availableDateFrom;
		this.availableDateTo = availableDateTo;
		this.otherDetails = otherDetails;
		this.menuItemsList = menuItemsList;
	}


	public String getMenuId() {
		return menuId;
	}


	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}


	public String getMenuName() {
		return menuName;
	}


	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}


	public String getAvailableDateFrom() {
		return availableDateFrom;
	}


	public void setAvailableDateFrom(String availableDateFrom) {
		this.availableDateFrom = availableDateFrom;
	}


	public String getAvailableDateTo() {
		return availableDateTo;
	}


	public void setAvailableDateTo(String availableDateTo) {
		this.availableDateTo = availableDateTo;
	}


	public String getOtherDetails() {
		return otherDetails;
	}


	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}


	public List<MenuItems> getMenuItemsList() {
		return menuItemsList;
	}


	public void setMenuItemsList(List<MenuItems> menuItemsList) {
		this.menuItemsList = menuItemsList;
	}


	@Override
	public String toString() {
		return "Menus [menuId=" + menuId + ", menuName=" + menuName + ", availableDateFrom=" + availableDateFrom
				+ ", availableDateTo=" + availableDateTo + ", otherDetails=" + otherDetails + ", menuItemsList="
				+ menuItemsList + "]";
	}
	
	
	
	
}
