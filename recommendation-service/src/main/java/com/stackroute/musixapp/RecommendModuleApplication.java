package com.stackroute.musixapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RecommendModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecommendModuleApplication.class, args);
	}

}
