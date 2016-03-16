package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MvcBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcBootApplication.class, args);
		
		RestTemplate restTemplate =new RestTemplate();
		String obj = restTemplate.getForObject("http://localhost:5050/person/all",String.class);
		System.out.println(obj);
	}
}
