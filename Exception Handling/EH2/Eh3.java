package EH2;
import java.util.*;

public class Eh3 {

	public static void main(String[] args) {
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value of A");
			int a = sc.nextInt();
			
			System.out.println("Enter the value of B");
			int b = sc.nextInt();
			
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			e.printStackTrace();	//name cause and path
			System.out.println();
			System.out.println(e);	//name cause
			System.out.println(e.getMessage());	//cause
		}
	}

}
