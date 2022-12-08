package com.madhu.synchronizedblock;
class Display{
	public void greet(String name) {
		System.out.println("welcome:"+name);
		//synchronized (Display.class) {
		synchronized (this) {
			
		
			for(int i=1;i<=5;i++) {
				System.out.println(" welcome to synchronized block:"+i+":"+name);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("thank you for visiting:"+name);
			
		}
	}
}
class MyThread extends Thread{
	Display display;
	String name;
	public MyThread(Display display, String name) {
		this.display = display;
		this.name = name;
		
	}
	public void run() {
		display.greet(name);
	}
	
}
public class Test {

	public static void main(String[] args) {
		Display display = new Display();
		//Display display1 = new Display();
		MyThread thread = new MyThread(display, "madhu");
		MyThread thread1 = new MyThread(display, "madhu00");
		
		thread.start();
		thread1.start();

	}

}
