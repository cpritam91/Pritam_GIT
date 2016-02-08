package training.com.hashmap;

public class HashMapApplication {

	public static void main(String[] args) {

		Manager m1 = new Manager(101,"Pritam");
		Manager m3 = new Manager(103,"Prasanjit");
		
		Employee e1 = new Employee(201,"Mukesh");
		Employee e2 = new Employee(202,"Shubham");
		Employee e3 = new Employee(203,"Supriyo");
		Employee e4 = new Employee(204,"Rohit");

		EmployeeHandler obj = new EmployeeHandler();
		
		obj.addEmployeeToManager(m1, e1);
		obj.addEmployeeToManager(m1, e2);
		obj.addEmployeeToManager(m3, e3);
		obj.addEmployeeToManager(m3, e4);
		
		obj.displayMap();
		
		
	}

}
