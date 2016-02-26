package com.training.apps;

import java.util.List;

import com.training.daos.*;
import com.training.entity.*;
import com.training.utils.ValidateUser;

public class RestroApplication {

	public static void main(String[] args) {
		
		Waiter wt1 = new Waiter(104,"Rajesh",15000.0,8745963620L,true);
		
		Table t1 = new Table(5,wt1.getEmpId());
		
		//wt1.setTable(t1);
		
		BillDAO bdao = new BillDAO();
		
		OrderDAO odao = new OrderDAO();
		EmployeeDAO edao = new EmployeeDAO();
		
		//edao.add(wt1);
		
		//TableDAO tdao = new TableDAO();
		
		//tdao.add(t1);
		Bill b1 = new Bill(501,t1.getTableNo(),"Abhishek",5,0.0);
		
		//Order o1 = new Order(b1.getBillNo(),201,13,2,false);
		Order o2 = new Order(b1.getBillNo(),202,12,3,false);
		//bdao.add(b1);

		//wt1.placeOrder(o2);
		Chef c1 = new Chef(edao.find(102));
		c1.viewIncompleteOrders();
		
		c1.completeOrder(202);
		c1.viewIncompleteOrders();
		
		System.out.println(wt1.generateBill(501));
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
		
//		ItemDAO idao = new ItemDAO();
//		
//		Item i1 = new Item(11,"Chicken Mughlai",190.0,"Curries",true,false);
//		idao.add(i1);
//		
		
	}

}
