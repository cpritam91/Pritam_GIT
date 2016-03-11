package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Book;


@Controller
@RequestMapping("/bookEntry.htm")
public class BookController {
	
	@Autowired
	private Book book;
	
	@Autowired
	private ModelAndView mdl;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initForm() {
		
		mdl.setViewName("AddBook");
		mdl.addObject("command",book);
		return mdl;
	}
	
	@ModelAttribute("subjectCode")
	public String[] subjects() {
		return new String[]{"Computers","Novels","Medical" };
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("bookObj") Book book) {
		
		//IOC Controller is doing the following work for us using the model attribute -> mdl.addObject("bookObj",book) 
		
		mdl.setViewName("Success");
		return mdl;
	}
}
