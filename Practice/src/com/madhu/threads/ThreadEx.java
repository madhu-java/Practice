package com.madhu.threads;
class MyThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("thread:"+i);
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
//		myThread.start();
		myThread.run();
		for(int i=0;i<=5;i++) {
			System.out.println("main thread:"+i);
		}
		
	}
	}


