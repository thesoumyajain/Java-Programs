package com.tns.constructors;

class Student5
{
	String name;
	int age;
	
	Student5()
	{
		name = "ramu";
		age = 21;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
public class UserDefinedConstructors {

	public static void main(String[] args) {
		Student5 s1 = new Student5();
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}

}
