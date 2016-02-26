package com.training.entity;

import java.util.ArrayList;

import com.training.daos.*;

public class Waiter extends Employee {

	private Table table;

	public Waiter(int empId, String empName, double salary, long mobNo, boolean isEnabled) {
		super(empId, empName, salary, mobNo, isEnabled);
	}
	public Waiter(int empId, String empName, double salary, long mobNo, boolean isEnabled,int tableNo) {
		super(empId, empName, salary, mobNo, isEnabled);
		this.table = new Table(tableNo,empId);
	}
	
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	
	public void placeOrder(Order od) {
		
		OrderDAO obj = new OrderDAO();
		obj.add(od);
	}
	
	public double generateBill(int BillNo) {
		
		OrderDAO odao = new OrderDAO();
		ItemDAO idao = new ItemDAO();
		ArrayList<Order> allOrders = odao.findOrder(BillNo);
		double total = 0;
		for(Order od : allOrders)
			total += (idao.returnPrice(od.getItemId()).getPrice()*od.getQuantity());
		return total;
	}
}
