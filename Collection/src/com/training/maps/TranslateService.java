package com.training.maps;

import java.util.*;

public class TranslateService {

	private Hashtable<String, String> hindiToEnglish;

	public TranslateService() {

		hindiToEnglish = new Hashtable<String , String>();
		init();
		
	}
	
	public void init() {
		
		hindiToEnglish.put("Ek","One");
		hindiToEnglish.put("Kela","Banana");
		hindiToEnglish.put("Chawal","Rice");
		
	}
	
	public String findEngWord(String hindiWord) {
		
		return hindiToEnglish.get(hindiWord);
	}
	
	public void printWords() {
		
		Set<Map.Entry<String,String>> list = hindiToEnglish.entrySet();
		System.out.println("Hindi - English Words");
		
		for(Map.Entry<String, String> words: list)
		{
			System.out.println(words.getKey() + ":=" +words.getValue());
		}
	}
	
}
