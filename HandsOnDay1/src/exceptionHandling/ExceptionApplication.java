package exceptionHandling;

import java.util.Scanner;

public class ExceptionApplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter Employee ID :");
			int id = sc.nextInt();
			System.out.print("Enter Employee Name :");
			String name = sc.next();
			System.out.print("Enter Employee Skill :");
			String desig = sc.next();
			System.out.print("Enter Employee Salary :");
			double salary = sc.nextDouble();
			ExceptionApplication.testSalary(desig,salary);
			Employee obj = new Employee(id,name,desig,salary);
			System.out.println("Employee Details added Successfully!!");
			sc.close();
		}
		catch(SalaryException e)
		{
			System.out.println("Salary Exception Caught!!!");
		}

	}

	static void testSalary(String skill,double salary) throws SalaryException
	{
		if((skill.equals("unskilled") && salary < 8500)||(skill.equals("semi-skilled") && salary < 9500)||(skill.equals("skilled") && salary < 10500))
			throw new SalaryException("Minimum Salary not fulfilled");
	}
}
