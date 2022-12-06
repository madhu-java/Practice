package com.madhu.threads;
class Yexx extends Thread{
	public void run() {
		System.out.println("in child");
		Thread.yield();
		for(int i=0;i<=5;i++) {
			System.out.println("child thred:"+i);
			
		}
	}
}
public class YEX1 {

	public static void main(String[] args) throws InterruptedException {
		Yexx yexx = new Yexx();
		yexx.start();
		for(int i=0;i<=5;i++) {
			System.out.println("main thred:"+i);
			Thread.sleep(1000);
		}

	}

}
