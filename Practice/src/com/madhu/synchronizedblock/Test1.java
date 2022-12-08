package com.madhu.synchronizedblock;
class ThreadN extends Thread{
	int total =0;
	
	public void run() {
		synchronized (this) {
			System.out.println("child thread acquited lock on t");
		
		for(int i=1;i<=1000;i++) {
			total+=i;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.notify();
		System.out.println("child thread released lock on t");
		}
	}
}
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		ThreadN t= new ThreadN();
		t.start();
		//Thread.sleep(1000);
		synchronized (t) {
			System.out.println("main thread waiting for t object");
			//Thread.sleep(1000);
			t.wait();
			System.out.println("main thread got notification:");
			System.out.println("total:"+t.total);
		}
		

	}

}
