package com.madhu.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
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
		//pQueue.add("madhu");
		System.out.println(pQueue);
//		for(Object obj:pQueue) {
//			System.out.println(obj);
//		}
		  Iterator iterator= pQueue.iterator();
		  while(iterator.hasNext()) {
			  System.out.println(iterator.next());
		  }
		  //reverse
		  System.out.println("Reverse order");
		  LinkedList linkedList=new LinkedList();
		  linkedList.addAll(pQueue);
		  ListIterator listI= linkedList.listIterator(linkedList.size());
		  while(listI.hasPrevious()) {
			  System.out.println(listI.previous());
		  }
		  Iterator iterator2=linkedList.descendingIterator();
		  while(iterator2.hasNext()) {
			  System.out.println(iterator2.next());
		  }
		  

	}

}
