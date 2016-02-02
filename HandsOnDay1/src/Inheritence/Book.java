package Inheritence;

public class Book extends Media{

	private String isbn_Number;
	
	public Book() {
		super();
	}

	public Book(String title, String iSBN_Number, int lendingLength) {
		super(title,lendingLength);
		this.isbn_Number = iSBN_Number;
	}

	public String getIsbn_Number() {
		return isbn_Number;
	}

	public void setIsbn_Number(String isbn_Number) {
		this.isbn_Number = isbn_Number;
	}
	
	public void printMedia()
	{

		System.out.println("ISBN Number : " + isbn_Number);
		super.printMedia();
	}
	
}
