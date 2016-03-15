package com.training.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.CarRental;

@Controller
public class RentalController {

	@Autowired
	CarRental car;
	
	@Autowired
	ModelAndView mdl;
	
	@RequestMapping("/")
	public String initApp() {
		return "index";
	}
	
	@RequestMapping(name="/AddRequest",method = RequestMethod.GET)
	public ModelAndView initCarRequest() {
		mdl.setViewName("AddCarRequest");
		mdl.addObject("command",car);
		return mdl;
	}
	
	@ModelAttribute("carType")
	public String[] getCarTypes() {
		return new String[]{"Indica Non AC","Santro AC","Qualis AC" };
	}
	@RequestMapping(name="/AddRequest",method = RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") CarRental carReq,BindingResult result) {
		
		String nextStep = "Welcome";
		if(result.hasErrors())
			nextStep = "AddCarRequest";
		return nextStep;
			
	}
	@RequestMapping("cust/check")
	public String checkStatus(@RequestParam("name") String name, Model mdl) {
		mdl.addAttribute("prevBooking","You last booked on 13th February 2015");
		return "Welcome";
	}
}
