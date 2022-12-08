package com.madhu.threads;

import javax.sound.midi.Soundbank;
class InterruptThread extends Thread{
	@Override
	public void run() {
		try {
		for(int i=1;i<=10;i++) {
			System.out.println("child thread:"+i);
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
class Threadt extends Thread{
	@Override
	public void run() {
		System.out.println("printing child thread");
	}
	}

public class InterruptEx {

	public static void main(String[] args) {
		InterruptThread iThread = new InterruptThread();
		iThread.start();
		//iThread.interrupt();
		Threadt threadt = new Threadt();
		threadt.start();
		threadt.interrupt();
		System.out.println("main thread");
		
	}

}
