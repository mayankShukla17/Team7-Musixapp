package com.stackroute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMusixServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMusixServiceApplication.class, args);
	}

}
