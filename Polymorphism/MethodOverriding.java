package com.tns.Polymorphism;

class Parent
{
	void marry()
	{
		System.out.println("Marry @ age of 26");
	}
}
class Child extends Parent
{
	void marry()
	{
		System.out.println("Marry @ age of 30");	//overriding method w.r.t child class
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Child c = new Child();
		
		c.marry();
	}

}
