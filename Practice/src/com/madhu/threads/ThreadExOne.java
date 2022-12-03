package com.madhu.threads;
class MyThread1 extends Thread{
	public void run() {
		System.out.println("child thread");
		System.out.println(Thread.currentThread().getName());
		run(10);
	}
	//overloading run()
	public void run(int i) {
		System.out.println("child thread with args");
		System.out.println(Thread.currentThread().getName());
	}
	public void start() {
		super.start();
		System.out.println("start method");
	}
}
public class ThreadExOne {

	public static void main(String[] args) {
		MyThread1 myThread = new MyThread1();
		myThread.start();
		//myThread.start();
		
//		myThread.run();
//		myThread.run(5);
		System.out.println("main thread");
		System.out.println(Thread.currentThread().getName());
		

	}

}
