package com.madhu.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {
		PriorityQueue pQueue=new PriorityQueue();
		pQueue.add(50);
		pQueue.add(10);
		pQueue.add(100);
		pQueue.add(25);
		pQueue.add(175);
		pQueue.add(125);
		System.out.println(pQueue);
//		for(Object obj:pQueue) {
//			System.out.println(obj);
//		}
		  Iterator iterator= pQueue.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }

	}

}
