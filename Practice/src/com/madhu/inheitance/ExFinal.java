package com.madhu.inheitance;
class Parentt{
	//final
	private String name ="Parent";
	 //final
	public void speak() {
		System.out.println("can speak 2 languages");
		//name = "madhu";
	}
}
class Childd extends Parentt{
	public void speak() {
		System.out.println("can speak 5 languages");
	}
	
}
public class ExFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
