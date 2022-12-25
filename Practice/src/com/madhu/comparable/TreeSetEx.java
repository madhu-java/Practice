package com.madhu.comparable;

import java.util.TreeSet;

import com.madhu.newinstance.NewInstance;

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
		TreeSet treeSet2 = new TreeSet();
		treeSet2.add("m");
		treeSet2.add("a");
		treeSet2.add("d");
		treeSet2.add("h");
		treeSet2.add(new String("h"));
		treeSet2.add("u");
		//treeSet2.add(new StringBuffer("b"));
		//classcast exception bcos StringBuffer doesn't implement 
		//comparable
		System.out.println(treeSet2);
		

	}

}
