package crea.pattern.prototype;

public class Client {

	public static void main (String args []) {
		
		Employee original = new Employee(101,"Pritam");
		Employee prototype = null;
		System.out.println("Original : "+original);
		
		try {
			prototype = (Employee)original.clone();
			
			prototype.setEmpName("Mr. "+prototype.getEmpName());
			
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Original : "+original);
		System.out.println("Prototype : "+prototype);
		
	}
	
}
