package Inheritence;

public class Dvd extends Media{

	private int runningTime;
	
	public Dvd() {
		super();
	}

	public Dvd(String title, int runningTime, int lending_length) {
		super(title,lending_length);
		this.runningTime = runningTime;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
	
	public void printMedia()
	{

		super.printMedia();
		System.out.println("Running Time : " + runningTime + " Mins");
		
	}
	
}
