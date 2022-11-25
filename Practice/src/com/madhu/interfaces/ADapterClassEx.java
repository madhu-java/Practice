package com.madhu.interfaces;
interface Sample11{
	void m1();
	void m2();
	void m3();
	void m4();
}
class AdapterClass implements Sample11{
	public void m1() {
		
	}
public void m2() {
		
	}
public void m3() {
	
}
public void m4() {
	
}
}
class M1 extends AdapterClass{
	public void m1() {
		System.out.println("M1 class only needs to override m1()");
	}
}
class M2 extends AdapterClass{
	public void m2() {
		System.out.println("M2 class only needs to override m2()");
	}
}
class M3 extends AdapterClass{
	public void m1() {
		System.out.println("M3 class only needs to override m1()");
	}
	public void m3() {
		System.out.println("M3 class only needs to override m3()");
	}
}
public class ADapterClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1 m1 = new M1();
		m1.m1();
		m1.m2();
		M2 m2 = new M2();
		m2.m1();
		m2.m2();
		M3 m3 = new M3();
		m3.m1();
		m3.m2();
		m3.m3();
		

	}

}
