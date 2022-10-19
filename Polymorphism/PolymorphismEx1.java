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
		System.out.println("Bike is moving with medium speed");
	}
}
class Car extends Vehicle
{
	void Move()
	{
		System.out.println("Car is moving with high speed");
	}
}
class Truck extends Vehicle
{
	void Move()
	{
		System.out.println("Truck is moving with low speed");
	}
}
public class PolymorphismEx1 {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();	//Object creation of parent class
		
		v = new Bike();
		v.Move();
		
		v = new Car();
		v.Move();
		
		v = new Truck();
		v.Move();	//1:3
	}

}
