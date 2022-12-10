package com.madhu.collections;

import java.util.ArrayList;

public class ArrayListEx{
	public static void main(String args[]) {
		ArrayList aList = new ArrayList();
		aList.add(10);
		aList.add(20);
		aList.add(30);
		aList.add(40);
		System.out.println(aList);
		aList.add(1,15);
		System.out.println("after adding at at index 1:"+aList);
		ArrayList aList2 = new ArrayList();
		aList2.add('A');
		aList2.add("Hello");
		aList2.add(true);
		aList2.add(10);
		aList2.add(20.098);
		System.out.println(aList2);
		
		//aList.addAll(aList2);
		aList.addAll(0,aList2);
		System.out.println(aList);
		System.out.println(aList2.indexOf(10));
		aList2.add(10);
		System.out.println(aList2.indexOf(10));
		System.out.println(aList2.lastIndexOf(10));
		System.out.println(aList.isEmpty());
		aList.ensureCapacity(20);//it doesn't return anything
		//System.out.println(aList.ensureCapacity(20);
		System.out.println(aList.size());
		System.out.println(aList2.size());
		aList.trimToSize();
		aList.clear();
		System.out.println(aList);
	}
}
//class MyThreadP extends Thread {
//    @Override
//    public void run() {
//        System.out.println("child thread priority:"+Thread.currentThread().getPriority());
//    }
//}
//public class ArrayListEx {
//
//	public static void main(String[] args) {
//		MyThreadP mp = new MyThreadP();
//
//        mp.start();
//
//        mp.setPriority(10);
//        Thread.currentThread().setPriority(7);
//
//        System.out.println("main-thread-priority:"+Thread.currentThread().getPriority());
////  try {
////	  System.out.println(100/0);
////  }catch(Exception e) {
////	  System.out.println(e.getMessage());
////  }catch(ArithmeticException e) {
////	  System.out.println(e.getMessage());
////  }
//	}
//
//}
