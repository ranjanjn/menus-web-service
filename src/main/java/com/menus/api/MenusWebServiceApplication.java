package com.menus.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MenusWebServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenusWebServiceApplication.class, args);
	}

}
