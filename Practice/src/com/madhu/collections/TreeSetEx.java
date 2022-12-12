package com.madhu.collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet ts= new TreeSet();
		ts.add(10);
		ts.add(100);
		ts.add(20);
		ts.add(40);
		ts.add(60);
		ts.add(1);
		System.out.println(ts);
		System.out.println(ts.last());
		System.out.println(ts.ceiling(60));
		
		System.out.println(ts.higher(60));
		System.out.println(ts.floor(60));
		System.out.println(ts.lower(60));
System.out.println(ts.ceiling(50));
		
		System.out.println(ts.higher(50));
		System.out.println(ts.floor(50));
		System.out.println(ts.lower(50));
	}

}
