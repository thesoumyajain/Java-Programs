package com.tns.Variables;

public class StaticVariable {
	String name;
	int aadhar_no;
	static String nationality = "Indian";
	public static void main(String[] args) {
		StaticVariable S1 = new StaticVariable();
		
		System.out.println(nationality);
		System.out.println(S1.nationality);
		System.out.println(StaticVariable.nationality);
	}

}
