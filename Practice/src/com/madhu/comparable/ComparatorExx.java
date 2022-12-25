package com.madhu.comparable;

import java.util.Comparator;
import java.util.TreeSet;
//sort given string and strimgbuffer objs in descending order
import com.madhu.newinstance.NewInstance;

public class ComparatorExx {

	public static void main(String[] args) {
		TreeSet treeSet= new TreeSet(new MyComparator1()) ;
			treeSet.add(new StringBuffer("Agsds"));
			treeSet.add("aaaa");
			treeSet.add(new StringBuffer("Xsd"));
			treeSet.add("aa");
			treeSet.add("aaaaaaaaa");
			treeSet.add(new StringBuffer("Csds"));
			treeSet.add("aaaasdfghjdfga");
			treeSet.add(new StringBuffer("Ssdsd"));
			treeSet.add("a");
			treeSet.add("aaa");
			
			System.out.println(treeSet);
		

	}

}
class MyComparator1 implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
		String s1= obj1.toString();
		//String s2 = (String)obj2;//classcast exception
		String s2 = obj2.toString();
		if(s1.length()<s2.length())
			return 1;
		else if(s1.length()>s2.length())
			return -1;
		else
		return -s1.compareTo(s2);
		
	}
}
