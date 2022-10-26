package EH1;

public class Eh5 {
	public static void wakeup()
	{
		try
		{
			System.out.println(10/0);
			sleep();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled in specific method");
		}
	}
	public static void sleep()
	{
		System.out.println("In sleep method");
	}
	public static void main(String[] args) {
		wakeup();
		System.out.println("In main method");
	}

}
