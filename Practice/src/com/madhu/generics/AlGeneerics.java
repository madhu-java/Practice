package com.madhu.generics;

import java.util.ArrayList;

public class AlGeneerics {
	public static void main(String[] args) {
		ArrayList< String> aList = new ArrayList<String>();
		aList.add("Madhu");
		//aList.add(10);
//		aList.add(10);
//		aList.add(true);
		System.out.println("in main:"+aList);
		methodOne(aList);
		ArrayList<Integer> IList = new ArrayList<>();
		IList.add(10);
//		IList.add("madhu");
//		IList.add(true);
		System.out.println("in main integer list:"+IList);
		methodOne(IList);

	}
	public static void methodOne(ArrayList al) {
		al.add(10);
		al.add(true);
		al.add("MAdhu");
		System.out.println("in method :"+al);
	}
	
}
