package com.training;

import java.io.*;

public class BookSerializer {

	public String serialize(Book obj) {
		String message = null;
		ObjectOutputStream out = null;//Outside try just to increase the scope.
		try {
			out = new ObjectOutputStream(
					new FileOutputStream(
							new File("Book.Ser"))); //Decorator Design Pattern.
			out.writeObject(obj);
			message = "One Object Serialized- Press F5 to View the File";
		}
		catch(IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		finally {
			
			try {
				out.close();
			}
			catch (IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		return message;
	}
	
	public Object deSerialize() {
		
		Object obj = null;
		//ObjectInputStream oin = null;
		/*Try-with-Resource to prevent the try block in the finally just to close the object*/
		try(ObjectInputStream oin = 
				new ObjectInputStream(
						new FileInputStream(
								new File("Book.Ser")))) {
			
			obj=oin.readObject();
			
		}
		catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		return obj;
		
	}
	
}
