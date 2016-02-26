package com.training.entity;

import java.util.ArrayList;

import com.training.daos.OrderDAO;

public class Chef extends Employee {

	public Chef(Employee emp)
	{
		super(emp.getEmpId(),emp.getEmpName(),emp.getSalary(),emp.getMobNo(),emp.isEnabled());
	}
	public Chef(int empId, String empName, double salary, long mobNo, boolean isEnabled) {
		super(empId, empName, salary, mobNo, isEnabled);
	}
	public void completeOrder(int orderId) {
		
		OrderDAO odao = new OrderDAO();
		Order od = odao.find(orderId);
		od.setReady(true);
		int rowUpdated = odao.update(od);
		System.out.println(rowUpdated + " Row[s] updated.");
	}
	public void viewIncompleteOrders() {
		
		OrderDAO odao = new OrderDAO();
		ArrayList<Order> list = odao.findIncompleteOrder();
		
		for(Order od : list) 
			System.out.println(od);
	}
}
