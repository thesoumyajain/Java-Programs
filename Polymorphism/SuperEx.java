package com.tns.Polymorphism;

class A
{
	int x = 10;
}
class B extends A
{
	int x=20;
	void fun2()
	{
		System.out.println(x);	//20
		System.out.println(this.x);	//20
		System.out.println(super.x);	//10
	}
}
public class SuperEx {

	public static void main(String[] args) {
		B b1 = new B();
		b1.fun2();
	}

}
