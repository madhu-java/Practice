package com.madhu.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
	Vector vector = new Vector();
	vector.add(10);
	vector.add(101);
	vector.add(50);
	vector.add(60);
	vector.add(90);
	System.out.println(vector);
	Iterator iterator = vector.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("using enumeration:");
	Enumeration enumeration=vector.elements();
	while(enumeration.hasMoreElements()) {
		System.out.println(enumeration.nextElement());
	}

	}

}
