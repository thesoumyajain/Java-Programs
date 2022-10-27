package EH2;
import java.util.*;

public class Eh2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the value of A");
			int a = sc.nextInt();
			
			System.out.println("Enter the value of B");
			int b = sc.nextInt();
			
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
		}
		finally
		{
			System.out.println("Finally executed");
		}
	}

}
