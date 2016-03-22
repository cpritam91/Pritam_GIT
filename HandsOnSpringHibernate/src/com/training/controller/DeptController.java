package com.training.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.daos.DepartmentDAO;
import com.training.daos.StudentDAO;
import com.training.domains.Department;
import com.training.domains.Student;

@Controller
@RequestMapping("/")
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
	
	@RequestMapping("/")
	public String initForm0() {
		return "index";
	}
	
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
	
	@RequestMapping(value="/ListTop3.htm", method = RequestMethod.GET)
	public String initForm2() {
		return "ListTop3";
	}
	
	@RequestMapping(value="/ListTop3.htm", method = RequestMethod.POST)
	public String onSubmit1(@RequestParam("deptId")int deptId, Model model) {
		
		Double overallMarks;
		Department dept = ddao.find(deptId);
		Set<Student> stuList = dept.getStudents();
		TreeMap<Double, Student> top3 = new TreeMap<Double, Student>();
		for(Student stu : stuList)
		{
			overallMarks = stu.getMarks_Academic()*0.5 + stu.getMarks_Event()*0.1 
					+ stu.getMarks_Sport()*0.2 + stu.getMarks_Cultural()*0.2;
			System.out.println("--"+stu.getName()+"--"+overallMarks+"--");
			top3.put(overallMarks, stu);
		}
		List<Student> finalList = new ArrayList<Student>();
		SortedSet<Double> keys = new TreeSet<Double>(top3.descendingKeySet());
		int count = 3;
		for (Double key : keys) { 
		   if(count-- == 0)
			   break;
		   Student name = top3.get(key);
		   finalList.add(name);
		}
		model.addAttribute("finalList",finalList);
		return "Success2";
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
