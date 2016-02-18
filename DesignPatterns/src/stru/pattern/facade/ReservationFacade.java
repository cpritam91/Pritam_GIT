package stru.pattern.facade;

public class ReservationFacade {
	
	HotelDetails objHotel;
	FlightDetails objFlight;
	
	public ReservationFacade() {
		objHotel = new HotelDetails();
		objFlight = new FlightDetails();
		
	}
	
	public HotelDetails getHotel() {
		
		return objHotel;
	}
	
	public FlightDetails getFlight() {
		
		return objFlight;
	}
	
}
