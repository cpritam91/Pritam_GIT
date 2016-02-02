package polymorphism;

import java.util.Scanner;

public class RentalApplication {

	public static void main(String[] args) {

		Fan f1 = new Fan(101,"High Speed",35);
		Fan f2 = new Fan(102,"4-Blade",50);
		Fan f3 = new Fan(103,"Luxury",75);
		Furniture fu1 = new Furniture(201,"Chair",30);
		Furniture fu2 = new Furniture(202,"Table",40);
		Furniture fu3 = new Furniture(203,"Bed",110);
		AirConditioner ac1 = new AirConditioner(301,0.75,250);
		AirConditioner ac2 = new AirConditioner(302,1.00,400);
		AirConditioner ac3 = new AirConditioner(303,1.50,500);
		
		RentalHandler.addItem(f1);
		RentalHandler.addItem(f2);
		RentalHandler.addItem(f3);
		RentalHandler.addItem(fu1);
		RentalHandler.addItem(fu2);
		RentalHandler.addItem(fu3);
		RentalHandler.addItem(ac1);
		RentalHandler.addItem(ac2);
		RentalHandler.addItem(ac3);
		
		System.out.println("Have a look at our items : ");
		RentalHandler.printItemArray();
		
		System.out.println("Enter how many items to enter : ");
		Scanner sc = new Scanner ( System.in);
		
		int num = sc.nextInt();
		int ino,days;
		float rent,totalRent=0;
		for(int i=0; i<num;i++)
		{
			System.out.println("Enter Item no. and No of days to rent:");
			ino = sc.nextInt();
			days = sc.nextInt();
			rent = RentalHandler.displayRent(ino, days);
			totalRent += rent;
		}
		System.out.println("The overall rent for all items is : Rs. "+totalRent);
		sc.close();
	}

}
