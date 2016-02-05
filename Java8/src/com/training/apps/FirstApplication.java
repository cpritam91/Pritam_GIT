package com.training.apps;

import java.util.ArrayList;

import com.training.ifaces.Greeting;

public class FirstApplication {

	public static void main(String[] args) {
		/*Lambda Expression*/
		Greeting grt = ()-> { 
			System.out.println("I don't know Java 8");
			};
				
		grt.show();
		
		/*Method References*/
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Ramesh");
		nameList.add("Rakesh");
		nameList.add("Rajesh");
		nameList.add("Prakash");
		
		nameList.forEach(System.out::println);
		
		
		
	}

}
