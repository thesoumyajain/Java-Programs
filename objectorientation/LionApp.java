package com.tns.objectorientation;

public class LionApp {
	String name;
	String breed;
	String gender;
	
	void eat()
	{
		System.out.println("lion always eats non-veg");
	}
	void sleep()
	{
		System.out.println("lion sleeps 10 hr per day");
	}
	void run()
	{
		System.out.println("lion runs faster than human being");
	}
	public static void main(String[] args) {
		LionApp l1 = new LionApp();	//object creation is done using new keyword
		
		l1.name = "simba";	//values for objects is given using ref variables
		l1.breed = "Asiatic";
		l1.gender = "male";
		System.out.println(l1.name);
		System.out.println(l1.breed);
		System.out.println(l1.gender);
		
		l1.eat();
		l1.sleep();
		l1.run();
	}

}
