package com.madhu.threads;
class SClass extends Thread{
	int sum=0;
	public void run() {
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
	}
}
public class JoinEx1 {

	public static void main(String[] args) throws InterruptedException {
		SClass sClass = new SClass();
		sClass.start();
		
		System.out.println(sClass.sum);
		System.out.println("main");
	}

}
