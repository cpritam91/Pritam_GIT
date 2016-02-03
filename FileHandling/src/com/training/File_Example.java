package com.training;

import java.io.*;

public class File_Example {

	public static void main(String[] args) {
		
		File f = new File("Sample.txt");//Doesn't create a file
		/*File object only represents a file.. The exact object is not present there*/
		System.out.println(f.exists());
		
		try {
			f.createNewFile();//Creates a file
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(f.exists());
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(f);
			writer.println("Hello");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {

			writer.close();
		}
		
		/*Display all the file names in the current directory*/
		/*File dir = new File(".");
		
		String [] files = dir.list();
		
		for(String file:files) {
			System.out.println(file);
		}*/
		/*To differentiate between a file and a directory*/
		displayPath(new File("."),0);
	}
	public static void displayPath(File f,int tab)
	{
		
		File [] files1 = f.listFiles();
		for(File file1:files1) {
			for(int i=0;i<tab;i++)
				System.out.print("\t");
			if(file1.isDirectory())
			{
				System.out.println(file1.getName());
				displayPath(file1,tab+1);
			}
			else
				System.out.println(file1.getName());
		}
	}
	
}
