package stru.pattern.facade;

import java.util.HashMap;
import java.util.Map;

public class FlightDetails implements ReservationDetails {

	private HashMap<String,Integer> flightInfo;
	
	public FlightDetails() {
		super();
		flightInfo = new HashMap<String,Integer>();
		flightInfo.put("KOL - DEL", 22);
		flightInfo.put("DEL - KOL", 25);
	}


	public void getAvailibility() {
		
		for (Map.Entry<String, Integer> entry : flightInfo.entrySet()) {
			   System.out.println("(" + entry.getKey() + " : " + entry.getValue() +")");
			}
	}

}
