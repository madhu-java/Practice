package com.madhu.threads;
class YieldThread extends Thread{
	
	public void run() {
		System.out.println("from run:");
		Thread.yield();
		for(int i=0;i<=5;i++) {
			//Thread.yield();
			System.out.println("child"+i);
		}
	}
	
}
class YieldThread1 extends Thread{
	
	public void run() {
		System.out.println("from run1:");
		Thread.yield();
		for(int i=0;i<=5;i++) {
			//Thread.yield();
			System.out.println("child1"+i);
		}
	}
	
}
public class YieldEx {

	public static void main(String[] args) {
		YieldThread yieldThread = new YieldThread();
		
		YieldThread1 yieldThread1 = new YieldThread1();
		yieldThread.setPriority(3);
		yieldThread1.setPriority(3);
		yieldThread.start();
		yieldThread1.start();
		for(int i=0;i<=5;i++) {
			System.out.println("main"+i);
		}
	}

}
