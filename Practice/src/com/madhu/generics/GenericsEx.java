package com.madhu.generics;

import javax.naming.ReferralException;

public class GenericsEx {

	public static void main(String[] args) {
		String[] arr= new String[10];
		arr[0]="aa";
		arr[1]="bb";
		arr[2]="cc";
		//arr[3]=23;CE, bcos array is type safe

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

}
