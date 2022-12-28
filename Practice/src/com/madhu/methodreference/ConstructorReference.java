package com.madhu.methodreference;
class Sample{
	private String string;
	public Sample(String string) {
		this.string=string;
		System.out.println("constructor executed"+string);
		System.out.println();
	}
}

interface inter{
	Sample m1(String string);
}
public class ConstructorReference {

	public static void main(String[] args) {
		inter in = s->new Sample(s);
		System.out.println();
		in.m1("this is constructor interface");
		
		

	}

}
