package com.madhu.generics;

import java.util.ArrayList;

import javax.sound.midi.Soundbank;

public class Generics {

	public static void main(String[] args) {
		ArrayList aList = new ArrayList();
		aList.add(10);
		aList.add("madhu");
		aList.add(10.34);
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("madhu");
		//stringList.add(10);
String string= stringList.get(0);//no need to typecast
//String string2 = aList.get(0);//we have integer valut at 0
Integer integer=(Integer)aList.get(0);//need to typecast
System.out.println(string);
System.out.println(integer);

	}

}
