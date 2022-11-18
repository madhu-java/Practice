package com.madhu.innerclasses;
class First{
	public void show() {
		System.out.println("in outer show");
	}
	static class Inner{
		public void show() {
			System.out.println("in inner show");
		}
	}
}

public class StsticInnerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First.Inner objFirst;
		//objFirst= new First();
		objFirst = new First.Inner();
		objFirst.show();
	}

}
