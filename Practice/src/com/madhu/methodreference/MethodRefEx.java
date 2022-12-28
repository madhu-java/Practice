package com.madhu.methodreference;

public class MethodRefEx {
public static void m12() {
	for(int i=0;i<=5;i++) {
		System.out.println("child thread");
	}


}
public  void m13() {
	for(int i=0;i<=5;i++) {
		System.out.println("child thread");
	}


}
	public static void main(String[] args)throws Exception {
		Runnable runnable = MethodRefEx::m12;
		//Runnable runnable =  new MethodRefEx()::m13;
		Thread thread = new Thread(runnable);
		
		thread.start();
		for(int i=0;i<=5;i++) {
			System.out.println("main thread");
		}

	}

}
