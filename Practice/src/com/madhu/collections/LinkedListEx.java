package com.madhu.collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.add(10);
		linkedList.add(11);
		linkedList.add(12);
		linkedList.add(13);
		System.out.println(linkedList);
		linkedList.addFirst(0);
		linkedList.addLast(100);
		linkedList.add(1,1);
		System.out.println(linkedList);
		LinkedList linkedList2= new LinkedList();
		linkedList2.add(10);
		linkedList2.add("Madhu");
		linkedList2.add(true);
		linkedList2.add(13.678);
		System.out.println(linkedList2);
		linkedList.addAll(2, linkedList2);
		System.out.println(linkedList);
		System.out.println(linkedList.indexOf(10));
		System.out.println(linkedList.lastIndexOf(10));
		System.out.println(linkedList.get(2));
		System.out.println(linkedList2.getLast());
		System.out.println(linkedList2.peek());
		System.out.println(linkedList2);
		System.out.println(linkedList.peek());
		System.out.println(linkedList);
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
		linkedList.offerFirst(200);
		linkedList.offerLast(0);
		System.out.println(linkedList);
		
		
		

		

	}

}
