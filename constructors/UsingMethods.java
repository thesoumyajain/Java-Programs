package com.tns.constructors;

//initializing the object through method
class Student1
{
	String name;
	int roll_no;
	
	public void setData(String sname, int sroll_no)
	{
		name = sname;
		roll_no = sroll_no;
	}
	public String getName()
	{
		return name;
	}
	public int getRoll_no()
	{
		return roll_no;
	}
}
public class UsingMethods {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setData("somu",89);
		System.out.println(s1.getName());
	}

}
