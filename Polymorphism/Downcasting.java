package com.tns.Polymorphism;

class Plane3
{
	String name;
	int wheel;
	
	void takeOff()
	{
		System.out.println("Plane is taking off");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}
class CargoPlane3 extends Plane3
{
	void takeOff()
	{
		System.out.println("CargoPlane is taking off");
	}
	void fly()
	{
		System.out.println("CargoPlane is flying with the low speed");
	}
	void CarryCargo()
	{
		System.out.println("CargoPlane is carrying the goods");
	}
}
class PassengerPlane3 extends Plane3
{
	void fly()
	{
		System.out.println("Fighterplane is flying with the high speed");
	}
	void CarryArms()
	{
		System.out.println("Fighterarms is carring the weapons");
	}
}
public class Downcasting {

	public static void main(String[] args) {
		Plane3 ref = new Plane3();	//Parent class object creation
		
		ref = new CargoPlane3();	//Parent ref to child object
		//ref = new CargoPlane3();
		
		ref.fly();
		ref.land();
		((CargoPlane3)(ref)).CarryCargo();
	}

}
