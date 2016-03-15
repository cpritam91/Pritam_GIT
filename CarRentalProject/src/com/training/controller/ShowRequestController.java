package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.domains.CarRental;

import java.util.*;

import javax.servlet.http.HttpServletRequest;
@Controller
public class ShowRequestController {

	@Autowired
	ModelAndView mdlVw;
	
	@RequestMapping("/showAll")
	public String getAllRequests(Model model) {
		
		List<CarRental> reqData = new ArrayList<CarRental>();
		
		reqData.add(new CarRental("Pritam", 8879865432L, "pritam@abc.com", "Indica Non AC"));
		reqData.add(new CarRental("Sumit", 9876432345L, "sumit@abc.com", "Indica AC"));
		reqData.add(new CarRental("Rahman", 9878923212L, "rahman@abc.com", "Innova AC"));
		
		model.addAttribute("reqList",reqData);
		
		return "ShowAllRequests";
	}
	
	@RequestMapping(value = "/findRequest/{custName}/{email}", method = RequestMethod.GET)
	public String custDetails(@PathVariable("custName") String custName, @PathVariable("email") String email, Model model) throws RuntimeException {
		
		if(custName.equals("Rahman"))
			throw new RuntimeException(); // Forcibly exception is thrown just to check
		
		model.addAttribute("email",email);
		System.out.println(email);
		return "Result";
	}
	
	@ExceptionHandler(java.lang.RuntimeException.class) //Can handle multiple exceptions by adding them separated by comma
	public ModelAndView handleException(HttpServletRequest req, RuntimeException ex) {
		mdlVw.addObject("msg", "Runtime Exception Caught");
		mdlVw.addObject("url",req.getRequestURL());
		mdlVw.addObject("exception",ex);
		mdlVw.setViewName("ExceptionPage");
		return mdlVw;
	}
}
