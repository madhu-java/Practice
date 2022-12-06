package com.madhu.threads;
class JClass extends Thread{
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("child:"+i);
		}
	}
}
public class JoinEx {

	public static void main(String[] args) {
		JClass jClass = new JClass();
		jClass.start();
		for(int i=0;i<=5;i++) {
			System.out.println("main:"+i);
		}
	}

}
