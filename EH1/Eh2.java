package EH1;
import java.util.*;

public class Eh2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for A");
		int a = sc.nextInt();
		System.out.println("Enter the value for B");
		int b = sc.nextInt();
		try
		{
			System.out.println("A/B is "+(a/b));
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred, b value must be a non-zero positive number");
		}
	}

}
