package com.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.StudentDAO;
import com.training.domains.Student;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private Student stu;
	
	@Autowired
	private StudentDAO sdao;
	@Autowired
	private ModelAndView mdl;

	@RequestMapping(value="/addStudent.htm", method = RequestMethod.GET)
	public ModelAndView initForm() {
		
		mdl.setViewName("AddStudent");
		mdl.addObject("command",stu);
		return mdl;
	}
	
	@RequestMapping(value="/addStudent.htm", method = RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("stuObj") Student stu) {
		
		//Student stu1 = new Student(1,"Pritam",90,70,25,80);
		sdao.add(stu);
		
		mdl.setViewName("Success");
		return mdl;
	}
}
