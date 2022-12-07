package com.madhu.threads;
class Sync{
	public synchronized void num() {
		int total=0;
		for(int i=0;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class SThread extends Thread{
	Sync sync = new Sync();
//	public SThread(Sync sync) {
//		this.sync =sync;
//	}
	public void run() {
		sync.num();
	}
}
public class SyncEx {

	public static void main(String[] args) {
		
		SThread sThread = new SThread();
		
		SThread sThread1 = new SThread();
		sThread.start();
		sThread1.start();
	}

}
/////////////////////////////////////////////////////////
//package com.madhu.threads;
//class Sync{
//	public synchronized void num() {
//		int total=0;
//		for(int i=0;i<=10;i++) {
//			System.out.println(Thread.currentThread().getName()+" "+i);
//		}
//	}
//}
//class SThread extends Thread{
//	Sync sync;
//	public SThread(Sync sync) {
//		this.sync =sync;
//	}
//	public void run() {
//		sync.num();
//	}
//}
//public class SyncEx {
//
//	public static void main(String[] args) {
//		Sync sync = new Sync();
//		SThread sThread = new SThread(sync);
//		
//		SThread sThread1 = new SThread(sync);
//		sThread.start();
//		sThread1.start();
//	}
//
//}
