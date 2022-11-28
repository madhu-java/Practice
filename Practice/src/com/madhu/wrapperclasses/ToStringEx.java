package com.madhu.wrapperclasses;
//toString() converts primitive or object into String
public class ToStringEx {

	public static void main(String[] args) {
		Integer integer = new Integer("10");
		System.out.println(integer);//internally calls the toString () to print data
        String string = Integer.toString(10);
        System.out.println(string);
        System.out.println(Boolean.toString(true));
        System.out.println(Double.toString(10.06));
        System.out.println(Integer.toString(20,2));
        System.out.println(Double.toHexString(10.06));
        //static factory methods
        System.out.println(String.valueOf('a'));
        System.out.println(String.valueOf(10));
        System.out.println(String.valueOf(20.05));
        System.out.println(String.valueOf("True"));
        Integer integer2 = 10;//AutoBoxing==>primitive to==>wrapper object
        System.out.println(integer2);
        int i =integer2;//AotoUnboxing ==>wrapper object to Primitive
        System.out.println(i);
        Integer i1 = 10;
        Integer i2 =i1;
        i1++;
        System.out.println(i1);
        System.out.println(i2);
        
        System.out.println(i1==i2);
        Integer i10= 10;
        Integer i3 =10;
        System.out.println(i10==i3);
        Integer i4 = 130;
        Integer i5 = 130;
        System.out.println(i4==i5);
        
        
        
        
	}

}
