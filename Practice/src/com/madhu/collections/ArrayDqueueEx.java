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

	}

}
