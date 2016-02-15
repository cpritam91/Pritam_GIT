package com.training.apps;

import java.util.List;

import com.training.daos.*;
import com.training.entity.*;
import com.training.utils.ValidateUser;

public class RestroApplication {

	public static void main(String[] args) {
		
		//EmployeeDAO obj = new EmployeeDAO();
		
		//Employee emp = new Employee(102,"Sumit",10978.0,9324511223L,true);
		//obj.add(emp);
		
		/*System.out.println(obj.find(102));
		
		List<Employee> list = obj.findAll();
		
		for(Employee emp1 : list)
			System.out.println(emp1);*/
		
		//UserDAO ubj = new UserDAO();
		
		//User u1 = new User(103,"sumit","Chef");
		
		//ValidateUser vu = new ValidateUser();
		
		//boolean isValid = vu.checkUser(u1);
		
		//System.out.println(isValid);
		//ubj.add(u1);
		
		//obj.delete(101);
		
		ItemDAO idao = new ItemDAO();
		
		Item i1 = new Item(11,"Chicken Mughlai",190.0,"Curries",true,false);
		idao.add(i1);
		
		
	}

}
