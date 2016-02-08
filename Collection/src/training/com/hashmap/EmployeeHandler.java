package training.com.hashmap;

import java.util.*;

public class EmployeeHandler {

	private HashMap<Integer,List<Employee>> empMap;

	public EmployeeHandler() {
		
		empMap = new HashMap<Integer,List<Employee>>();
	}
	
	public void addEmployeeToManager(Manager mgr,Employee emp) {
		
		mgr.addEmployee(emp);
		empMap.put(mgr.getManagerId(), mgr.getSubordinates());
				
	}

	public void displayMap()
	{
		Set<Map.Entry<Integer, List<Employee>>> list = empMap.entrySet();
		for(Map.Entry<Integer, List<Employee>> mgr : list)
		{
			System.out.println("Manager ID : "+mgr.getKey());
			System.out.println("Subordinates : ");
			List<Employee> emplist = mgr.getValue();
			for(Employee emp : emplist)
				System.out.println(emp);
		}
	}
}
