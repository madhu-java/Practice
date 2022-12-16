package com.madhu.interfaces;
interface SampleD{
	void print();
	default void display() {
		System.out.println("default interface method");
	}
	static void greet() {
		System.out.println("greet static method");
	}
//	private  static void hello() {
//		System.out.println("allowed from 1.9");
//	}
//	private void hello() {
//		System.out.println("allowed from 1.9");
//	}
	
}
class ISampleD implements SampleD{
//	public void display() {
//		System.out.println(" default overridden  method ");
//	}
	public void print() {
		System.out.println("print");
	}
	static void greet() {
		System.out.println("greet child method");
	}
	
}
public class WithDefalutMtd {

	public static void main(String[] args) {
		ISampleD iSampleD = new ISampleD();
		iSampleD.display();
		iSampleD.print();
	SampleD.greet();
	iSampleD.greet();
	}

}
