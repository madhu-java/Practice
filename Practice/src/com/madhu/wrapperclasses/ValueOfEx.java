package com.madhu.wrapperclasses;
//ValueF os used to convert primitive/string into WRapperObjact
class Ex{
	Integer i1 = Integer.valueOf("10");
	Integer i2 = Integer.valueOf("20");
	Integer i3 = Integer.valueOf("10", 2);
	Integer i4 = Integer.valueOf("25", 36);
	Integer i5 = Integer.valueOf(100);
	Double double1 = Double.valueOf(10.5);
	Float float1 = Float.valueOf(20.03f);
	Boolean boolean1 = Boolean.valueOf(true);
	Character character = Character.valueOf('a');
}
public class ValueOfEx {

	public static void main(String[] args) {
		Ex ex = new Ex();
		System.out.println(ex.i1);
		System.out.println(ex.i2);
		System.out.println(ex.i3);
		System.out.println(ex.i4);
		System.out.println(ex.i5);
		System.out.println(ex.double1);
		System.out.println(ex.float1);
		System.out.println(ex.boolean1);
		System.out.println(ex.character);

	}

}
