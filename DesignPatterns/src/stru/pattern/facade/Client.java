package stru.pattern.facade;

public class Client {

	public void getAvailiblity() {
		
		ReservationFacade rf = new ReservationFacade();
				
		rf.getFlight().getAvailibility();
		rf.getHotel().getAvailibility();
	}
	
	
	public static void main(String[] args) {

		Client obj = new Client();
		obj.getAvailiblity();
		
	}

}
