package com.tns.Inheritance;

class A
{
	int i=10;
}
class B extends A
{
	int j = 20;
}
public class SingleInheritance {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);
	}

}
