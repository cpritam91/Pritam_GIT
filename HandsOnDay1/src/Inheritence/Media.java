package Inheritence;

public class Media {

	private String title;
	private int lending_length;
	
	public Media() {
		super();
	}

	public Media(String title, int lending_length) {
		super();
		this.title = title;
		this.lending_length = lending_length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getLending_length() {
		return lending_length;
	}

	public void setLending_length(int lending_length) {
		this.lending_length = lending_length;
	}
	
	public void printMedia()
	{
		System.out.println("Title : " + title);
		System.out.println("Lending Length : " + lending_length + " Days");
	}
	
}
