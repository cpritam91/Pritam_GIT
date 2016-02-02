package exceptionHandling;

public class SalaryException extends Exception {

	String message = "Entered Salary doesn't match minimum salary value!!";
	
	public SalaryException() {
		// TODO Auto-generated constructor stub
	}

	public SalaryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public SalaryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}

}
