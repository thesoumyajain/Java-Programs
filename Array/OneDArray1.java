package com.tns.Array;
import java.util.*;

public class OneDArray1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter the marks: ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<=4;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
