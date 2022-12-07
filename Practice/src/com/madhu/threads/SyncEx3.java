package com.madhu.threads;
class Disp{
	public synchronized void displayNums() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		public synchronized void displayChars() {
			for(int i=65;i<=75;i++) {
				System.out.println(( char)i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	class MyTrd1 extends Thread{
		Disp display;
		public MyTrd1(Disp display) {
			this.display=display;
		}
		public void run() {
			display.displayNums();
		}
	}
	class MyTrd2 extends Thread{
		Disp display;
		public MyTrd2(Disp display) {
			this.display=display;
		}
		public void run() {
			display.displayChars();
		}
	}
public class SyncEx3 {

	public static void main(String[] args) {
		Disp display = new Disp();
		//Disp display1 = new Disp();
		
		MyTrd1 trd1 = new MyTrd1(display);
		MyTrd2 trd2 = new MyTrd2(display);
		trd1.start();
		trd2.start();
		

	}

}
