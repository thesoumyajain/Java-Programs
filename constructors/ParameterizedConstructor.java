package com.tns.constructors;

class Student4
{
	String name;
	int age;
	
	Student4(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student4 s1 = new Student4("Ramu");
		System.out.println(s1.getName());
	}

}
