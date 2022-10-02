package com.tns.Variables;

public class StaticVariable2 {
	static int x = 25;
	int y = 50;
	public static void main(String[] args) {
		StaticVariable2 S1 = new StaticVariable2();
		System.out.println(S1.x);
		System.out.println(S1.y);
		S1.x = 143;
		S1.y = 420;
		System.out.println(S1.x);
		System.out.println(S1.y);
		
		
		StaticVariable2 S2 = new StaticVariable2();
		System.out.println(S2.x);
		System.out.println(S2.y);
	}

}
