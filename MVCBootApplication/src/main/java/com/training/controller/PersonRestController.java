package com.training.controller;

import com.training.domains.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonRestController {
	
	Map<Integer,Person> personMap = new HashMap<>();
	
	@PostConstruct
	public void init() {
		personMap.put(1, new Person("Pritam","Kolkata"));
		personMap.put(2, new Person("Sumit","Bihar"));
		personMap.put(3, new Person("Rahman","UP"));
	}
	
	@RequestMapping("/all")
	public Collection<Person> getAll() {
		return personMap.values();
	}
}
