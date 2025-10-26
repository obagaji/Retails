package com.retail.Material;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RetailMaterialApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailMaterialApplication.class, args);
	}

}
