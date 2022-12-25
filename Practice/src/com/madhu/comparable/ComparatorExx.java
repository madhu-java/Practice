package com.madhu.comparable;

import java.util.Comparator;
import java.util.TreeSet;

import com.madhu.newinstance.NewInstance;

public class ComparatorExx {

	public static void main(String[] args) {
		TreeSet treeSet= new TreeSet(new MyComparator1()) ;
			treeSet.add(new StringBuffer("A"));
			treeSet.add(new StringBuffer("X"));
			treeSet.add(new StringBuffer("C"));
			treeSet.add(new StringBuffer("S"));
			System.out.println(treeSet);
		

	}

}
class MyComparator1 implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1= obj1.toString();
		//String s2 = (String)obj2;//classcast exception
		String s2 = obj2.toString();
		return -s1.compareTo(s2);
		
	}
}
