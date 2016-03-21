package com.training.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.DepartmentDAO;
import com.training.daos.StudentDAO;
import com.training.domains.Department;
import com.training.domains.Student;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	private Student stu;
	@Autowired
	private Department dept;
	/*@Autowired
	private Department dept1;*/
	@Autowired
	private StudentDAO sdao;
	@Autowired
	private DepartmentDAO ddao;
	
	@Autowired
	private ModelAndView mdl;

	@RequestMapping(value="/AddStudent.htm", method = RequestMethod.GET)
	public ModelAndView initForm() {
		
		mdl.setViewName("AddStudent");
		mdl.addObject("command",stu);
		//mdl.addObject("command1",dept1);
		return mdl;
	}
	
	@RequestMapping(value="/AddStudent.htm", method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("stuObj") Student stu) { //,@ModelAttribute("deptObj") Department dept) {
		
		sdao.add(stu);
		System.out.println(ddao.find(stu.getDeptId()));
		return "Success";
		
	}
	
	@RequestMapping(value="/AddDepartment.htm", method = RequestMethod.GET)
	public ModelAndView initForm1() {
		
		mdl.setViewName("AddDepartment");
		mdl.addObject("command",dept);
		return mdl;
	}
	
	@RequestMapping(value="/AddDepartment.htm", method = RequestMethod.POST)
	public String onSubmit1(@ModelAttribute("deptObj") Department dept) {
		
		ddao.add(dept);
		return "Success1";
	}
	
	@ModelAttribute("deptList")
	public Map<Integer,String> getDeptList() {
		Map<Integer,String> deptList = new HashMap<Integer, String>();
		List<Department> dList = ddao.findAll();
		for (Department department : dList) {
			deptList.put(department.getDeptId(),department.getDeptName());
		}
		return deptList;
	}
}
