package Inheritence;

public class Periodical extends Media {

	String subject;
	int volumeNumber;
	
	public Periodical() {
		super();
	}
	
	public Periodical(String title, String subject, int volumeNumber, int lending_length) {
		super(title, lending_length);
		this.subject = subject;
		this.volumeNumber = volumeNumber;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getVolumeNumber() {
		return volumeNumber;
	}

	public void setVolumeNumber(int volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	public void printMedia()
	{

		super.printMedia();
		System.out.println("Subject : " + subject);
		System.out.println("Volume Number : " + volumeNumber);
		
	}
	
}
