package com.tns.Array;
import java.util.*;

public class JaggedArray {

	public static void main(String[] args) {
		int a[][] = new int [3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				System.out.println("Enter the marks of student " + j +"of classroom "+i);
				a[i][j]= sc.nextInt();
			}
		}
		
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=0;j<=a[i].length-1;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
