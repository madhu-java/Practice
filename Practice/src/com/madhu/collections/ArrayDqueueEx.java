package com.madhu.collections;

import java.util.ArrayDeque;

public class ArrayDqueueEx {

	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque();
		arrayDeque.add(10);
		arrayDeque.add("Madhu");
		arrayDeque.add(true);
		arrayDeque.add(13.678);
		System.out.println(arrayDeque);
		arrayDeque.addFirst(2);
		arrayDeque.addLast(1);
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.contains(10));
		System.out.println(arrayDeque.getFirst());
		System.out.println(arrayDeque.getLast());
		System.out.println(arrayDeque.size());
		ArrayDeque a2 = new ArrayDeque();
		a2.add("Madhu");
		a2.add(true);
		System.out.println(arrayDeque.containsAll(a2));
		System.out.println(a2.isEmpty());
		a2.clear();
		System.out.println(a2);

	}

}
