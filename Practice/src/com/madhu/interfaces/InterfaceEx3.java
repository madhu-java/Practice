package com.madhu.interfaces;
interface Sample1{
	public static final int  a=1;
	void m1();
	
}
interface Sample2{
	public static final int  a=30;
	void m2();
}
class Demo implements Sample1,Sample2{
	public void m1() {
		System.out.println("From Sample1");
		System.out.println(Sample1.a);
		
	}
	public void m2() {
		System.out.println("From Sample2");
		System.out.println(Sample2.a);
	}
	
	
}
interface Sample3{
	void m4();
}
public class InterfaceEx3  extends Demo implements Sample3{
public void m4() {
	System.out.println("Methos of Sample 3");
	//System.out.println(a);//ambiguity problem
	System.out.println(Sample1.a);
	System.out.println(Sample2.a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Sample1.a);
		Sample3 sample3 = new InterfaceEx3();
		sample3.m4();
		Demo demo = new InterfaceEx3();
		demo.m1();
		demo.m2();
//		System.out.println(Sample1.a);
//		System.out.println(Sample2.a);

	}

}
