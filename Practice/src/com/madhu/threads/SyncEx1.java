package com.madhu.threads;
class Display{
	public synchronized void wish(String name) {
		System.out.print("Good morning:");
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println(name);
	}
}
class MyThread0 extends Thread{
	Display11 d;
	String name;
	public MyThread0(Display11 d, String name) {
		this.d = d;
		this.name =name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
	
}
public class SyncEx1 {

	public static void main(String[] args) {
		Display11 d = new Display11();
		MyThread0 myThread0 = new MyThread0(d, "madhu");
		MyThread0 myThread1 = new MyThread0(d, "madhu00");
		myThread0.start();
		myThread1.start();

	}

}
