package com.tns.javastatements2;

public class Demo1 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			l1:for(int j=0;j<10;j++)
			{
				if(j==5)	//it will skips 5
				{
					continue l1;
				}
				System.out.println(i+" "+j);
			}
		}
	}

}
