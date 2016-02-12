package com.training.apps;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.training.domains.NewShowRoom;
import com.training.ifaces.Automobile;


public class AutomobileApplication {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("MyFirstLog");
		BasicConfigurator.configure();
		
		
		NewShowRoom showRoom = new NewShowRoom();
		Automobile polyAuto = null;

		int key;
		
		log.info("Main Method Called");
		
		Scanner sc = new Scanner(System.in);
		
		log.info("Scanner Object Created");
		
		while(true){
			
			System.out.print("1 -> Passenger Car 2 -> Luxury Car 3 -> Sports Car 4 -> Sports Bike 5 -> Exit \n Enter Your Choice : ");
			key=sc.nextInt();
			if(key==5)
				break;
			else if(key>=1 && key<=4)
			{
				polyAuto = showRoom.getItem(key);
				showRoom.printQuote(polyAuto);
			}
			else
				System.out.println("Wrong Choice!!!");
		}
		sc.close();
		log.info("Main Method Completed");
	}
//Heelloo
}
