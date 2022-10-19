package com.tns.Polymorphism;

class Vehicle
{
	void Move()
	{
		System.out.println("Vehicle is moving");
	}
}
class Bike extends Vehicle
{
	void Move()
	{
		System.out.println("Bike is moving medium speed");
	}
}
class Car extends Vehicle
{
	void Move()
	{
		System.out.println("Car is moving high speed");
	}
}
class Truck extends Vehicle
{
	void Move()
	{
		System.out.println("Truck is moving with low speed");
	}
}
public class MethodOverridingEx2 {

	public static void main(String[] args) {
		Bike b = new Bike();
		Car c = new Car();
		Truck t = new Truck();
		
		b.Move();	//1:1
		c.Move();	//1:1
		t.Move();	//1:1
	}

}
