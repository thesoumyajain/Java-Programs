package com.tns.Polymorphism;

class Plane1
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
class CargoPlane1 extends Plane1
{
	void takeOff()
	{
		System.out.println("CargoPlane is taking off");
	}
	void fly()
	{
		System.out.println("Cargoplane is flying with the low speed");
	}
	void CarryCargo()
	{
		System.out.println("CargoPlane is carrying the goods");
	}
}
class PassengerPlane1 extends Plane1
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
class FighterPlane1 extends Plane1
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
public class PolymorphismEx3 {

	public static void main(String[] args) {
		Plane1 ref = new Plane1();	//Parent object creation
		
		//CargoPlane cp = new CargoPlane();	//Child reference to child object
		ref = new CargoPlane1();	//parent ref to the child object
		
		ref.takeOff();
		ref.fly();
		ref.land();
		//ref.CarryCargo();
		
		ref = new PassengerPlane1();
		ref.takeOff();
		ref.fly();
		ref.land();
		//ref.CarryPassenger();
		
		ref = new FighterPlane1();
		ref.takeOff();
		ref.fly();
		ref.land();
		//ref.CarryArms();
	}

}
