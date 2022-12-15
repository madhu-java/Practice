package com.madhu.collections;

import java.util.ArrayList;

public class FailSafeEx {

	public static void main(String[] args) {
		ArrayList aList =new ArrayList<>();
		aList.add(14);
		aList.add(24);
		aList.add(34);
		System.out.println(aList);
		for(int i=0;i<aList.size();i++) {
			System.out.println(aList.get(i));
			aList.add(0);
		}

	}

}
