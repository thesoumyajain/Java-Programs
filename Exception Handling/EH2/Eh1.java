package EH2;

import java.util.*;

public class Eh1 {

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
		catch(ArithmeticException e)
		{
			System.out.println("Learn maths...");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Please enter valid inputs");
		}
		catch(Exception e)
		{
			System.out.println("Invalid");
		}
	}

}
