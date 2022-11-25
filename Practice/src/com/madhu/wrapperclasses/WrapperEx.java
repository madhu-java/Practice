package com.madhu.wrapperclasses;

public class WrapperEx {

	public static void main(String[] args) {
		//Integer, Byte,Short,Long takes same value(int,byte,short,long) and string
		Integer i1= new Integer(10);
		Integer i2 = new Integer("10");
		System.out.println(i1);
		System.out.println(i2);
//		Integer i3 = new Integer("Ten");//NumberFormatException
//		System.out.println(i3);
		Byte byte1 = new Byte((byte) 9);
		Byte byte2 = new Byte("4");
		System.out.println(byte1);
		System.out.println(byte2);
		
		//float takes sloat, double, string
		Float float1 = new Float(10.09);
		Float float2 = new Float(10.09f);
		Float float3 = new Float("10.09");
		Float float4 = new Float("10.09f");
		System.out.println(float1);
		System.out.println(float2);
		System.out.println(float3);
		System.out.println(float4);
		
		//character takes only char
		Character c1=new Character('9');
		Character c2=new Character('s');
		System.out.println(c1);
		System.out.println(c2);
		//Boolean other than true, and all forms of string true rest all are false
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean(false);
		//Boolean boolean3 = new Boolean(True);
		Boolean boolean4 = new Boolean("true");
		Boolean boolean5 = new Boolean("True");
		Boolean boolean6 = new Boolean("false");
		Boolean boolean7 = new Boolean("TRUE");
		Boolean boolean8 = new Boolean("Hello");
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		System.out.println(boolean4);
		System.out.println(boolean5);
		System.out.println(boolean6);
		System.out.println(boolean7);
		System.out.println(boolean8);
		
		
		
	}

}
