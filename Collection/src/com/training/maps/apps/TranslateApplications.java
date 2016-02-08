package com.training.maps.apps;

import com.training.maps.TranslateService;

public class TranslateApplications {

	public static void main(String[] args) {

		TranslateService obj = new TranslateService();
		
		obj.printWords();
		
		System.out.println(obj.findEngWord("Chawal"));
	}

}
