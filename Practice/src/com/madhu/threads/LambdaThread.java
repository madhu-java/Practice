package com.madhu.threads;

public class LambdaThread {

	public static void main(String[] args) {
		Runnable runnable = ()->{
			Thread.yield();
			for(int i=0;i<=5;i++) {
				System.out.println("child thread:"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
