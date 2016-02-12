package com.training.apps;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.training.domain.FoodItem;
import com.training.domain.Restaurant;

public class RestroApplication {
	
	public static void displayList(ArrayList<FoodItem> list) {
		
		for(FoodItem it : list)
			System.out.println(it);
		
	}
	public static void main(String args[]) {

		Logger log = Logger.getRootLogger();
		
		log.setLevel(Level.INFO);
		
		log.info("Starting Application");
		
		FoodItem f1 = new FoodItem(101,"Chicken Biriyani",150.0,false);
		FoodItem f2 = new FoodItem(102,"Paneer Roll",60.0,true);
		FoodItem f3 = new FoodItem(103,"Chicken Shwarma",80.0,false);
		FoodItem f4 = new FoodItem(104,"Kadai Paneer",120.0,true);
		FoodItem f5 = new FoodItem(105,"Chicken Reshmi Kabab",260.0,false);
		
		Restaurant aminia = new Restaurant();
		
		aminia.init(f1);
		aminia.init(f2);
		aminia.init(f3);
		aminia.init(f4);
		aminia.init(f5);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your choice (1-> Menu Card 2-> Veg Items 3-> Non-veg Items) : ");
		int ch = sc.nextInt();
		
		ArrayList<FoodItem> list = new ArrayList<FoodItem>();
		switch(ch) {
			
			case 1:
				list = (ArrayList<FoodItem>)aminia.getMenuCard();
				break;
			case 2:
				list = (ArrayList<FoodItem>)aminia.getItems("veg");
				break;
			case 3:
				list = (ArrayList<FoodItem>)aminia.getItems("non-veg");
				break;
			default:
				System.out.println();
		}
		displayList(list);
		sc.close();
		
		log.info("Main Completed");
	}
}
