package EH1;

public class Eh6 {
	public static void wakeup()
	{
		System.out.println(10/0);
		sleep();
	}
	public static void sleep()
	{
		System.out.println("In sleep method");
	}
	public static void main(String[] args) {
		try
		{
			wakeup();
			System.out.println("In main method");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in main");
		}
	}

}
