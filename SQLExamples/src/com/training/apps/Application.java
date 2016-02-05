package com.training.apps;

//import java.util.*;

import com.training.daos.CustomerDAO;
//import com.training.entity.Customer;

public class Application {

	public static void main(String[] args) {

		//System.out.println(SQLConnection.getOracleConnection());
		
		//Customer cust1 = new Customer(103,"Rahul","rahul@abc.com",929882323L);
		//Customer cust2 = new Customer(104,"Ravi","ravi@abc.com",956653123L);
		//Customer cust3 = new Customer(105,"Rehman","rehman@abc.com",99087553L);

		CustomerDAO dao= new CustomerDAO();
		
		
		//int rowAdded = dao.add(cust1);
		 //rowAdded = dao.add(cust2);
		 //rowAdded = dao.add(cust3);
		
		//System.out.println(rowAdded + ":= Row[s] Added");
		
		//Customer c1 = dao.find(102);
		//List<Customer> list = dao.findAll();
		
	//	for (Customer cus : list)
		//	System.out.println(cus.showCustomer());
		//System.out.println(c1.showCustomer());
		//int rowDeleted = dao.delete(102);
		//System.out.println(rowDeleted + ":= Row[s] Deleted");
		int rowUpdated = dao.update(104);
		System.out.println(rowUpdated + ":= Row[s] Updated");
	}

}
