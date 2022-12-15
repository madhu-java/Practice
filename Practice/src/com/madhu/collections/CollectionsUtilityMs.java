package com.madhu.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsUtilityMs {

	public static void main(String[] args) {
		ArrayList aList =new ArrayList<>();
		aList.add(194);
		aList.add(24);
		aList.add(394);
		
		aList.add(14);
		aList.add(240);
		aList.add(24);
		//aList.add("madhu");
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList);
		int index= Collections.binarySearch(aList, 14);
		System.out.println(index);
		//aList.add(14);
		Collections.shuffle(aList);
		System.out.println(aList);
		System.out.println(Collections.min(aList));
		System.out.println(Collections.max(aList));
		System.out.println(Collections.frequency(aList, 24));
	}

}
