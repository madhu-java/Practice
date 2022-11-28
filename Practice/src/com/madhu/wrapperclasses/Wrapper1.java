package com.madhu.wrapperclasses;
class WrapperExx{
	Integer integer= new Integer(10);
	Integer integer1= new Integer(10);
	Integer integer2= new Integer(20);
	
}
public class Wrapper1 {

	public static void main(String[] args) {
		WrapperExx wEx = new WrapperExx();
		System.out.println(wEx.integer==wEx.integer1);
		System.out.println(wEx.integer==wEx.integer2);
		
		
		
	}

}
