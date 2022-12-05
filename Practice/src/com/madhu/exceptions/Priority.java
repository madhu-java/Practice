package com.madhu.exceptions;

class MyThread3 extends Thread{
	@Override
	public void run() {
		System.out.println("child thread");
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Priority {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		myThread3.start();
		System.out.println("main thread:"+Thread.currentThread().getPriority());
	}

}
