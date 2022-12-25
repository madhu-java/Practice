package com.madhu.comparable;

import java.util.TreeSet;

//Treeset() uses compareTo() method of comparable to sort the objects i
//in natural sorting order
public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet();
		treeSet.add(20);
		treeSet.add(10);
		treeSet.add(70);
		treeSet.add(0);
		//treeSet.add("madhu");//classcast exception
		//treeSet.add(null);//nullpointer exception
		System.out.println(treeSet);
		

	}

}
