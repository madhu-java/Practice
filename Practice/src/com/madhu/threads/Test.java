package com.madhu.threads;

class Display11
{
	public void wish(String name){
		;;;;;;;;;;;;; //l-lakh lines of code

		//lock of class level, so only thread can access this region as it is critical
		synchronized(Display11.class){
			System.out.println("Thread which is getting the lock is :: "+Thread.currentThread().getName());
			
	
			for (int i=1;i<=5;i++ ){
				System.out.print("Good morning:");
					try{
						Thread.sleep(2000);
					}catch (InterruptedException e){}
			
				System.out.println(name);
			}
		}
		System.out.println("Thread which is releasing the lock is :: "+Thread.currentThread().getName());
	    ;;;;;;;;;;;;;//1-lakh lines of code
	}
}
class MyThread11 extends Thread
{
	Display11 d;
	String name;

	MyThread11(Display11 d,String name){
		this.d = d;
		this.name =name;
	}

	@Override
	public void run(){
		d.wish(name);
	}
}

public class Test  {
	public static void main(String[] args){

		Display11 d1 = new Display11();
		Display11 d2 = new Display11();

		MyThread11 t1= new MyThread11(d1,"yuvi");
		MyThread11 t2= new MyThread11(d2,"dhoni");
		
		t1.setName("yuvi thread");
		t2.setName("dhoni thread");
		
		t1.start();
		t2.start();
	
	}

}

