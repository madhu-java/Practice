package com.madhu.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

import org.w3c.dom.ls.LSException;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet hSet=new HashSet();
		hSet.add(30);
		hSet.add(130);
		hSet.add(100);
		hSet.add(300);
		hSet.add(230);
		hSet.add(30);
		System.out.println(hSet);
		Iterator iterator= hSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		LinkedHashSet lHashSet = new LinkedHashSet();
		lHashSet.add(30);
		lHashSet.add(30);
		lHashSet.add(130);
		lHashSet.add(100);
		lHashSet.add(300);
		lHashSet.add(230);
		lHashSet.add(30);
		System.out.println(lHashSet);

	
	ArrayList aList=new ArrayList();
	aList.addAll(lHashSet);
	System.out.println("reverse");
	ListIterator ls= aList.listIterator(aList.size());
	while(ls.hasPrevious()) {
		System.out.println(ls.previous());
	}
	}

}
