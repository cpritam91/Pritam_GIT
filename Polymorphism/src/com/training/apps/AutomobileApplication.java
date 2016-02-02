package com.training.apps;
import java.util.Scanner;

import com.training.domains.NewShowRoom;
import com.training.ifaces.Automobile;


public class AutomobileApplication {

	public static void main(String[] args) {

		NewShowRoom showRoom = new NewShowRoom();
		Automobile polyAuto = null;

		int key;
		
		Scanner sc = new Scanner(System.in);
		
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
	}
//Heelloo
}
