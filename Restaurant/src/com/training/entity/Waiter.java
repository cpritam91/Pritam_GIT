package com.training.entity;

import java.util.*;

public class Waiter extends Employee {

	private Set<Integer> tables;

	public Waiter(int empId, String empName, double salary, long mobNo, boolean isEnabled) {
		super(empId, empName, salary, mobNo, isEnabled);
	}
	public Waiter(int empId, String empName, double salary, long mobNo, boolean isEnabled,Set<Integer> tables) {
		super(empId, empName, salary, mobNo, isEnabled);
		this.tables = tables;
	}
	

	public Set<Integer> getTables() {
		return tables;
	}
	public void setTables(Set<Integer> tables) {
		this.tables = tables;
	}
	
	public boolean addTable(int tableNo) {
		return tables.add(tableNo);
	}
	public boolean removeTable(int tableNo) {
		for(int tNo : tables) {
			if (tNo == tableNo) {
				tables.remove(tNo);
				return true;
			}		
		}
		return false;
	}
	public void viewTable() {
		System.out.println("Tables served by Employee - "+super.getEmpId()+" : ");
		for(int tno : tables) {
			System.out.print(tno + " ");
		}
		System.out.println();
	}
}
