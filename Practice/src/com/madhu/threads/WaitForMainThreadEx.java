package com.madhu.threads;
class MyThread2 extends Thread{
	static Thread mThread2;
	public void run() {
		
		try {
			mThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<=5;i++) {
			System.out.println("child:"+i);
		}
	}
}
public class WaitForMainThreadEx {

	public static void main(String[] args) throws InterruptedException{
		MyThread2.mThread2 = Thread.currentThread();
		MyThread2 myThread =  new MyThread2();
		myThread.start();
		//myThread.join();
		for(int i=0;i<=5;i++) {
			System.out.println("main:"+i);
			Thread.sleep(100);
		}

	}

}
