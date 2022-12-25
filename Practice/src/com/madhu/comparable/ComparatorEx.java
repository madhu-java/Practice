package com.madhu.comparable;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorEx {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator());
		//TreeSet treeSet = new TreeSet();
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(70);
		treeSet.add(0);
		System.out.println(treeSet);
	}
	

}
class MyComparator implements Comparator{
	@Override
	public int compare(Object obj1,Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		//method1:1
//		if(i1<i2)
//			return 1;
//		else if (i1>i2)
//			return -1;
//		else return 0;
		//method 2:
		//return i1.compareTo(i2);
		//method:2
		//return i2.compareTo(i1);
		//return -i1.compareTo(i2);
		return -i2.compareTo(i1);
	}
}