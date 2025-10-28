package com.retial.staff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReatialStaffApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReatialStaffApplication.class, args);
	}

}
