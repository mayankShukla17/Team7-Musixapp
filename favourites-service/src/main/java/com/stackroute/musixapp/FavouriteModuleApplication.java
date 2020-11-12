package com.stackroute.musixapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FavouriteModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FavouriteModuleApplication.class, args);
	}

}
