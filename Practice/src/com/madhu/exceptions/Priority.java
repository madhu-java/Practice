package com.madhu.exceptions;

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("child thread");
		System.out.println(Thread.currentThread().getPriority());
		for(int i=0;i<=5;i++) {
			yield();
			System.out.println("in child:"+i);
		}
	}
}
public class Priority {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();
		//myThread3.setPriority(10);
		//myThread3.setPriority(Thread.NORM_PRIORITY);
	//myThread3.setPriority(Thread.MIN_PRIORITY);
//		myThread3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("main thread:"+Thread.currentThread().getPriority());
		for(int i=0;i<=5;i++) {
			System.out.println("in main:"+i);
		}
	}

}
