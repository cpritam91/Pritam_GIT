package com.training.entity;

public class Table {
	
	private int tableNo;
	private int waiterId;
	
	
	
	public Table() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Table(int tableNo, int waiterId) {
		super();
		this.tableNo = tableNo;
		this.waiterId = waiterId;
	}



	public int getTableNo() {
		return tableNo;
	}



	public void setTableNo(int tableNo) {
		this.tableNo = tableNo;
	}



	public int getWaiterId() {
		return waiterId;
	}



	public void setWaiterId(int waiterId) {
		this.waiterId = waiterId;
	}



	@Override
	public String toString() {
		return "Table [tableNo=" + tableNo + ", waiterId=" + waiterId + "]";
	}
	
	

}
