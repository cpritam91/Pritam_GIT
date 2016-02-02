package Inheritence;

public class MediaHandler {

	static int size = 0;
	static Media list[] = new Media[10];
	
	public static void addMedia(Media m)
	{
		if(size == 10) {
			System.out.println( " Array Full!!! ");
			return;
		}
		list[size]=m;
		size++;
	}
	public static void showMedia(int choice)
	{
		for(int i=0;i<size;i++)
		{
			if(choice == 1 && list[i] instanceof Book)
				list[i].printMedia();
			else if(choice == 2 && list[i] instanceof Periodical)
				list[i].printMedia();
			else if(choice == 3 && list[i] instanceof Dvd)
				list[i].printMedia();
		}
	}
}
