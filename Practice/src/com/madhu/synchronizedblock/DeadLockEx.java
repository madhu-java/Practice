package com.madhu.synchronizedblock;

import org.omg.CORBA.PUBLIC_MEMBER;

class A{
	public void d1(B b) {
		System.out.println("Thread-1 starts execution of d1:");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		b.last();
	}
	public void last() {
		System.out.println("class A last():");
	}

}
class B{
	public void d2(A a) {
		System.out.println("Thread-1 starts execution of d1:");
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		a.last();
	}
	public void last() {
		System.out.println("class B last():");
	}

}
public class DeadLockEx  extends Thread{

	
		A a = new A();
		B b = new B();
	public void m1() {
			this.start();
		a.d1(b);
		
	}
	public void run() {
		b.d2(a);
	}
	public static void main(String args[]) {
		DeadLockEx tDeadLockEx = new DeadLockEx();
		tDeadLockEx.m1();
	}

}
