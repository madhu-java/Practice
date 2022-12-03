package com.madhu.threads;
class MThread extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("in child thead");
		if(i==3) {
			Thread.currentThread().setName("CHILD");
		}
		System.out.println("thread-name:"+Thread.currentThread().getName());
		}
	}
}
public class GetNameEx {

	public static void main(String[] args) {
		MThread mThread = new MThread();
		mThread.start();
		for(int i=0;i<=5;i++) {
			System.out.println("in main thead");
			if(i==3) {
				Thread.currentThread().setName("MAIN");
			}
			System.out.println(10/0);
			System.out.println("thread-main-name:"+Thread.currentThread().getName());
			}

	}

}
