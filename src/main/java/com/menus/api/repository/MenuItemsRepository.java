package com.menus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menus.api.domain.MenuItems;

@Repository
public interface MenuItemsRepository extends JpaRepository<MenuItems, String>{

}
