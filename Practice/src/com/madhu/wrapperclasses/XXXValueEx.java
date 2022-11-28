package com.madhu.wrapperclasses;

import javax.sound.midi.Soundbank;

//XXXValue is used to conver Wrapper class Object to primtives
//parseInt to convert String to primitives
class ToValue{
	Integer integer = new Integer(10);
	Character character= Character.valueOf('A');
	Boolean boolean1 = new Boolean("Madhu");
	
}
public class XXXValueEx {

	public static void main(String[] args) {
		ToValue toValue = new ToValue()
;
		System.out.println(toValue.integer.intValue());
		System.out.println(toValue.integer.byteValue());
		System.out.println(toValue.integer.shortValue());
		System.out.println(toValue.integer.longValue());
		System.out.println(toValue.integer.floatValue());
		System.out.println(toValue.character.charValue());
		System.out.println(toValue.boolean1.booleanValue());
		System.out.println(Integer.parseInt("10"));
		System.out.println(Double.parseDouble("10.09"));
		System.out.println(Boolean.parseBoolean("TRue"));
		
		
		
	}

}
