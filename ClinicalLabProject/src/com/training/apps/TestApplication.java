package com.training.apps;

import java.util.List;

import com.training.daos.EmployeeDAO;
import com.training.daos.UserDAO;
import com.training.entities.Employee;
import com.training.entities.User;

@SuppressWarnings("unused")
public class TestApplication {

	public static void main(String[] args) {
		
		UserDAO udao = new UserDAO();
		EmployeeDAO edao = new EmployeeDAO();
		
		Employee e1 = new Employee(101,"Pritam","Kolkata",9875544321L,16210.00);
		Employee e2 = new Employee(101,"Pritam","Gurgaon",9875544321L,16210.00);
		System.out.println(edao.add(e1)+" row added.");
		
		System.out.println(edao.find(101));
		
		//User u1 = new User("Administrator","Sumit","sumit","LC502");
		
		//System.out.println(udao.add(u1)+" row[s] added.");
		
		//System.out.println(udao.find("Pritam"));
		
		List<Employee> userList= edao.findAll();
		
		for(Employee u : userList)
			System.out.println(u);
		
		//udao.update(u1);
		System.out.println(edao.update(e2) + " row updated");
		System.out.println(edao.delete(101)+ " row deleted");
	}

}
