package stru.pattern.facade;

import java.util.HashMap;
import java.util.Map;

public class HotelDetails implements ReservationDetails {

	private HashMap<String,Integer> hotelInfo;	
	
	public HotelDetails() {
		super();
		hotelInfo = new HashMap<String,Integer>();
		hotelInfo.put("Taj Bengal", 15);
		hotelInfo.put("ITC Sonar", 8);
	}

	public void getAvailibility() {
		
		for (Map.Entry<String, Integer> entry : hotelInfo.entrySet()) {
			   System.out.println("(" + entry.getKey() + " : " + entry.getValue() +")");
			}
	}

}
