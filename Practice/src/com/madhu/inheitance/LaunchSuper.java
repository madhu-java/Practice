package com.madhu.inheitance;
class Parent{
	protected String name;
	protected int age;
	public String getName() {
		System.out.println("from parent"+name);
		return name;
	}
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
}
class Child extends Parent{
	private String name;
	private String qualification;
	public String getName() {
		System.out.println("from child"+super.name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Child(String name, String qualification) {
		super("Jenny",66);
		this.name = name;
		this.qualification = qualification;
	}
	
}
public class LaunchSuper {

	public static void main(String[] args) {
		
Parent parent = new Parent("mm", 66);
Child child = new Child("Aart","Btech");
parent.getName();
child.getName();
System.out.println();
	}

}
