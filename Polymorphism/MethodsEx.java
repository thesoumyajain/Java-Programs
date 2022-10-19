package com.tns.Polymorphism;

class Plane
{
	String name;
	int wheel;
	void takeoff()
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
class CargoPlane extends Plane
{
	void fly()	//overridden method
	{
		System.out.println("Cargoplane is flying with the low speed");
	}
	void CarryCargo()	//Specialized method
	{
		System.out.println("CargoPlane is carrying the goods");
	}
}
class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("Passenger plane is flying with the medium speed");
	}
	void CarryPassenger()
	{
		System.out.println("Passenger plane is carrying the people");
	}
}
class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("Fighter Plane is flying with the high speed");
	}
	void CarryArms()
	{
		System.out.println("FighterPlane is carrying the weapon");
	}
}
public class MethodsEx {

	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		
		cp.takeoff();
		cp.fly();
		cp.land();
		cp.CarryCargo();
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.CarryPassenger();
	}

}
