package com.madhu.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeEx {

	public static void main(String[] args) {
		ArrayList aList =new ArrayList<>();
		aList.add(14);
		aList.add(24);
		aList.add(34);
		System.out.println(aList);
		//structural modifications will lead to infinite loop using for loop
//		for(int i=0;i<aList.size();i++) {
//			System.out.println(aList.get(i));
//			aList.add(0);
//		}
		//failfast
		Iterator iterator=aList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			//aList.add(100);
		}
		CopyOnWriteArrayList cop= new CopyOnWriteArrayList<>()
;
		cop.add(10);
		cop.add(20);
		cop.add(30);
		Iterator iterator2=cop.iterator();
	while(iterator2.hasNext()) {
		System.out.println(iterator2.next());
		cop.add(100);
	}
	System.out.println("we didn't get  any exception");
		}

}
