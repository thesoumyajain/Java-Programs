package com.tns.objectorientation;

public class Demo1 {
		String name;
		String breed;
		String gender;
		
		void eat()
		{
			System.out.println("lion always eats non-veg");
		}
		void sleep()
		{
			System.out.println("lion sleeps 10hr per day");
		}
		void run()
		{
			System.out.println("lion runs faster than human being");
		}
	public static void main(String[] args) {
		Demo1 l1 = new Demo1();
		l1.eat();
		l1.sleep();
		l1.run();
	}

}
