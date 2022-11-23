package com.madhu.interfaces;

interface IDemo1{
	public abstract void m1();
	void m2();
	void m4(int a, int b);
	}
interface IDemo2{
	public abstract void m1();
	//public abstract int m1();//not valid
	void m3();
	void m4(int a, String b);
	}
public class InerfaceEx2 implements IDemo1,IDemo2 {

	public void m1() {
		System.out.println("Iam a common method in 2 interfaces");
	}
	//not valid
//	public int m1() {
//		System.out.println("Iam a common method in 2 interfaces");
//	}
	public void m2() {
		System.out.println("Iam from Idemo1");
	}
	public void m3() {
		System.out.println("i am from idemo2");
	}
	public void m4(int a , int b) {
		System.out.println(a*b);
	}
	public void m4(int a ,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDemo1 demo1 = new InerfaceEx2();
		demo1.m1();
		demo1.m2();
		IDemo2 demo2 = new InerfaceEx2();
		demo2.m1();
		demo2.m3();
		demo1.m4(10, 10);
		demo2.m4(10, "ten");

	}

}
