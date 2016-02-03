package com.training;

import java.io.*;

public class BookManager {
	
	public File addBooks(Object[] bks,File file) {
		
		try {
			PrintWriter out = new PrintWriter(
			new FileWriter(file,true));//true for appending
			for(int i=0;i<bks.length;i++) {
				
				out.println(bks[i]);
			}
				
			out.close(); 
			
			
		} catch (IOException e) { 
			System.out.println(e.getMessage());
		}
		
		return file;
	}
	
	public void printBooks(File fname) {
		
		try {
			
			FileReader fr = new FileReader(fname);
			BufferedReader br = new BufferedReader(fr);
			String line = null;
			
			try {
				while((line = br.readLine())!=null) {
					System.out.println(line);
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}	
}
