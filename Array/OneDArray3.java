package com.tns.Array;

import java.util.Scanner;

public class OneDArray3 {

	public static void main(String[] args) {
		System.out.println("Enter the length/size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("The length of the array is: "+a.length);
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println("Enter the marks of the student: ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
