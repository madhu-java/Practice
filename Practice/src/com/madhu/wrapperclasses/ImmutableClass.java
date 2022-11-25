package com.madhu.wrapperclasses;

public class ImmutableClass {
	int i;
  public ImmutableClass(int i) {
	this.i =i;
}
	public ImmutableClass modify(int i) {
		if (i == this.i) {
			return this;
		} else
			return new ImmutableClass(i);
	}

	public static void main(String[] args) {
		ImmutableClass immutableClass = new ImmutableClass(10);
		ImmutableClass immutableClass2 = immutableClass.modify(10);
	System.out.println((immutableClass == immutableClass2) );
	ImmutableClass immutableClass3 = immutableClass.modify(20);
	System.out.println((immutableClass == immutableClass3) );
	}

}
