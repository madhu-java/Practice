package com.madhu.generics;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.naming.ReferralException;

public class GenericsEx {

	public static void main(String[] args) {
		String[] arr= new String[10];
		arr[0]="aa";
		arr[1]="bb";
		arr[2]="cc";
		//arr[3]=23;CE, bcos array is type safe
		String s= arr[0];//no ty[ecstig required
		System.out.println(s);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		ArrayList aList= new ArrayList();
		aList.add(10);
		aList.add("aaa");
		aList.add(10.09);
		System.out.println();
		//String string = aList.get(0); typecasting required
		
		String string = (String) aList.get(1);
		int i = (Integer)aList.get(0);
		System.out.println(string);
		System.out.println(i);
		
		//generics solves typecasting and typesafe problems
		ArrayList<String> aStrings= new ArrayList<String>();
		//aStrings.add(10);
		aStrings.add("aa");
		aStrings.add("BBB");
		aStrings.add("CCCC");
		System.out.println(aStrings);
		//List<String> aList2 = new ArrayList<String>();
		//List<Object> aList3 = new LinkedList<String>();
		
		}

}
