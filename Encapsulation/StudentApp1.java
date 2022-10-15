package com.tns.methods;

class Student1
{
	private String name;
	private int age;
	private int roll_no;
	
	public void setData(String sname, int sage, int sroll_no)
	{
		name = sname;
		age = sage;
		roll_no = sroll_no;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getRoll_no()
	{
		return roll_no;
	}
}
public class StudentApp1 {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.setData("raju",21,84);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getRoll_no());
	}

}
