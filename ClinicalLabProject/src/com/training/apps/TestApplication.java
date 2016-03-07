package com.training.apps;

import java.util.List;

import com.training.daos.EmployeeDAO;
import com.training.daos.PatientDAO;
import com.training.daos.TestDAO;
import com.training.daos.UserDAO;
import com.training.entities.Employee;
import com.training.entities.Patient;
import com.training.entities.Test;
import com.training.entities.User;

@SuppressWarnings("unused")
public class TestApplication {

	public static void main(String[] args) {
		
		//UserDAO udao = new UserDAO();
		//EmployeeDAO edao = new EmployeeDAO();
		TestDAO tdao = new TestDAO();
		
		Test t1 = new Test("PP","Post Paradinal Glucose",1000.00);
		Test t2 = new Test("FAS","Fasting Glucose",2000.00);
		//Patient p2 = new Patient (1201,"Rajesh Mehra",52,8787654321L,"rajesh@outlook.com","Male");
		System.out.println(tdao.add(t1)+" test[s] added.");
		System.out.println(tdao.add(t2)+" test[s] added.");
		
		//Employee e1 = new Employee(101,"Pritam","Kolkata",9875544321L,16210.00);
		//Employee e2 = new Employee(101,"Pritam","Gurgaon",9875544321L,16210.00);
		//System.out.println(edao.add(e1)+" row added.");
		
		System.out.println(tdao.find("PP"));
		
		//User u1 = new User("Administrator","Sumit","sumit","LC502");
		
		//System.out.println(udao.add(u1)+" row[s] added.");
		
		//System.out.println(pdao.find(1201));
		
		List<Test> userList= tdao.findAll();
		
		for(Test u : userList)
			System.out.println(u);
		
		//udao.update(u1);*/
		//System.out.println(pdao.update(p1) + " patient[s] updated");
		//System.out.println(pdao.delete(1201)+ " patient[s] deleted");
	}

}
