package training.com.hashmap;

import java.util.ArrayList;

public class Manager {
	
	private int ManagerId;
	private String ManagerName;
	private ArrayList<Employee> subordinates = new ArrayList<Employee>();
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int managerId,String managerName) {
		super();
		ManagerId = managerId;
		ManagerName = managerName;
	}

	public int getManagerId() {
		return ManagerId;
	}

	public void setManagerId(int managerId) {
		ManagerId = managerId;
	}

	public String getManagerName() {
		return ManagerName;
	}

	public void setManagerName(String managerName) {
		ManagerName = managerName;
	} 
	
	public void addEmployee(Employee emp) {
		subordinates.add(emp);
	}
	public void displaySubordinates() {
		for(Employee emp : subordinates)
			System.out.println(emp);
	}

	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(ArrayList<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	
}
