package Inheritence;

import java.util.Scanner;

public class MediaApplication {

	public static void main(String[] args) {
		
		Book b1 = new Book("I too had a Love Story","IFB1234",20);
		Periodical p1 = new Periodical("Nature","Next Gen Communication",312,15);
		Dvd d1 = new Dvd("Anaconda",120,32);
		Book b2 = new Book("Secret of the Nagas","IFB9876",42);
		Dvd d2 = new Dvd("The Notebook",113,28);
		Periodical p2 = new Periodical("Career Graph","IIT JEE",722,8);
		
		MediaHandler.addMedia(b1);
		MediaHandler.addMedia(b2);
		MediaHandler.addMedia(p1);
		MediaHandler.addMedia(p2);
		MediaHandler.addMedia(d1);
		MediaHandler.addMedia(d2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the type of Media (1->Book 2->Periodical 3->Dvd) : ");
		int ch = sc.nextInt();
		
		if(ch >= 1 && ch <= 3)	
			MediaHandler.showMedia(ch);
		else
			System.out.println("WRONG CHOICE!!!!");
		
		sc.close();
	}

}
