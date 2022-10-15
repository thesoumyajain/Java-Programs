package com.tns.methods;

class Student
{
	private String name;
	private int age;
	private int roll_no;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	
}


public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Raju");
		System.out.println(s1.getName());
		s1.setAge(21);
		System.out.println(s1.getAge());
		s1.setRoll_no(84);
		System.out.println(s1.getRoll_no());
	}

}
