package com.madhu.interfaces;

interface Samp{
	void display();
	void print();
}
abstract class ImplSam implements Samp{
	public void display() {
		System.out.println("ImplSamp dispaly");
	}
}
public class InterfaceEx1 extends ImplSam implements Samp {
public void print() {
	System.out.println("from InterfaceEx1 print");
}
	public static void main(String[] args) {
		InterfaceEx1 ex1 = new InterfaceEx1();
		ex1.display();
		ex1.print();
		

	}

}
