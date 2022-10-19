package com.tns.Polymorphism;

class Plane2
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
class CargoPlane2 extends Plane2
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
class PassengerPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("PassengerPlane is flying with the medium speed");
	}
	void CarryPassenger()
	{
		System.out.println("PassengerPlane is carrying the people");
	}
}
class FighterPlane2 extends Plane2
{
	void fly()
	{
		System.out.println("Fighterplane is flying with the high speed");
	}
	void CarryArms()
	{
		System.out.println("Fighterplane is carrying the weapons");
	}
}
class Airport2
{
	void allow(Plane2 ref)
	{
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}
public class PolymorphismEx4 {

	public static void main(String[] args) {
		CargoPlane2 cp = new CargoPlane2();
		PassengerPlane2 pp = new PassengerPlane2();
		FighterPlane2 fp = new FighterPlane2();
		
		Airport2 a = new Airport2();
		a.allow(cp);
		a.allow(pp);
		a.allow(fp);
	}

}
