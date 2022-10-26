package EH1;

public class Eh4 {
	public static void wakeup()
	{
		sleep();
	}
	public static void sleep()
	{
		System.out.println(10/0);
		System.out.println("In sleep method");
	}
	public static void main(String[] args) {
		wakeup();
		System.out.println("In main method");
	}

}
