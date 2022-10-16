package com.tns.Array;
import java.util.*;

public class TwoDArray {

	public static void main(String[] args) {
		int a[][] = new int [3][5];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=4;j++)
			{
				System.out.println("Enter the marks of student " + j +"of classroom "+i);
				a[i][j]= sc.nextInt();
			}
		}
		
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=4;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
