package com.madhu.threads;
class Display0{
	public  synchronized void printSum(int n) {
		int sum =0;
		System.out.println("printing sum of  first "+n);
		for(int i=1;i<=n;i++) {
			sum+=i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("sum of first "+n+" numbers is "+sum);
		
	}
	public void hello(){
		System.out.println("Helooooo");
	}
}
class SumThread extends Thread{
	Display0 d;
	int n;
	public SumThread(Display0 d, int n) {
		this.d = d;
		this.n =n;
	}
	public void run() {
		d.printSum(n);
	}
}
public class SyncEx2 {

	public static void main(String[] args) {

Display0 display = new Display0();
Display0 display1 = new Display0();
SumThread s1= new SumThread(display, 5);

SumThread s2= new SumThread(display, 10);
SumThread s3= new SumThread(display1, 7);
s1.start();
display.hello();
s2.start();
display.hello();
s3.start();

	}

}
