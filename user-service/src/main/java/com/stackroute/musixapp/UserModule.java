package com.stackroute.musixapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.servlet.Filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableEurekaClient
@PropertySource("classpath:dbconfig.properties")
public class UserModule {
	
	public static void main(String[] args) {
		SpringApplication.run(UserModule.class, args);
	}

}


