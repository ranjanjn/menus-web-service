package com.menus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.menus.api.domain.Menus;

@Repository
public interface MenusRepository extends JpaRepository<Menus, String>{
	
	public Menus findBymenuName (String menuName);

}
