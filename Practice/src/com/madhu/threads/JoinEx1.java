package com.madhu.threads;
class SClass extends Thread{
	int sum=0;
	public void run() {
		for(int i=1;i<=10;i++) {
			sum+=i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class JoinEx1 {

	public static void main(String[] args) throws InterruptedException {
		SClass sClass = new SClass();
		sClass.start();
		//sClass.join(2000);
		//sClass.join();
		sClass.join(2000,200);
		System.out.println(sClass.sum);
		System.out.println("main");
	}

}
