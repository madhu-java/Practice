package com.madhu.threads;
class MyRunnable implements Runnable{
	public void run() {
		System.out.println("run method of myrunnable:");
	}
}
public class MyRunnableEx {

	public static void main(String[] args) {
		MyRunnable runnable = new MyRunnable();
		Thread thread = new Thread(runnable);
		Thread thread2 = new Thread();
		thread2.start();
		//thread.start();
		thread.run();
		thread2.run();
		//runnable.start();
		runnable.run();
		System.out.println("main method");

	}

}
