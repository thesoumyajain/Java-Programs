package com.tns.Array;
import java.util.*;

public class OneDArray2 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		int i;
		i = 0;
		while(i<=4)
		{
			System.out.println("Enter the marks: ");
			a[i] = sc.nextInt();
			i++;
		}
		
		i=0;
		while(i<=4)
		{
			System.out.print(a[i]+ " ");
			i++;
		}
	}

}
