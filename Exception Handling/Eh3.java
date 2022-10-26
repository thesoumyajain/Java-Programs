package EH1;

public class Eh3 {
	public static void wakeup()
	{
		sleep();
		System.out.println("In wakeup method");
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
