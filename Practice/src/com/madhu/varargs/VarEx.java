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
		System.out.println("addition:"+total);
	}
//	public void add(int[] b) {
//		
//	}
	public void add(int[]... a) {
		int total =0;
		for(int[] i :a) {
			for(int j:i) {
				total+=j;
			}
		}
		System.out.println("addition:"+total);
	}
	public void multiply(int a, int ...b) {
		int mul = a;
		for(int i :b) {
		mul*= i;
	}
		System.out.println("mul:"+mul);
	}
}
public class VarEx {

	public static void main(String[] args) {

Vars vars = new Vars();
//vars.add();
vars.add(10);
vars.add(10,20);
vars.add(10,20,30);
vars.multiply(1,2,3,4,5,6);
int[]a= {1,2,3,4};
int[] b = {5,6,7,8,9};
vars.add(a,b);

	}

}
