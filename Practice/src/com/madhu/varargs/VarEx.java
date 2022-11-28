package com.madhu.varargs;
class Vars{
//	public void add() {
//		System.out.println("nothing to add");
//	}
//	public void add (int a ) {
//		System.out.println(a);
//	}
//	public void add (int a , int b) {
//		System.out.println(a+b);
//	}
//	public void add (int a , int b,int c) {
//		System.out.println(a+b
//				+c);
//	}
	public void add(int...a) {
		System.out.println(a.length);
		int total=0;
		for(int i : a) {
			total+= i;
		}
		System.out.println(total);
	}
}
public class VarEx {

	public static void main(String[] args) {

Vars vars = new Vars();
vars.add();
vars.add(10);
vars.add(10,20);
vars.add(10,20,30);

	}

}
