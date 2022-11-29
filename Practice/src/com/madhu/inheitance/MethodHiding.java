package com.madhu.inheitance;
class A{
	protected static void print() {
		System.out.println("printing A");
	}
	protected void disp() {
		System.out.println("diaplaying A");
	}
}
class B extends A{
	protected static void print() {
		System.out.println("printing B");
	}
	protected void disp() {
		System.out.println("diaplaying B");
	}
}
public class MethodHiding {

	public static void main(String[] args) {
		A a = new B();
		a.print();
		a.disp();

	}

}
