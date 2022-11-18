package com.madhu.innerclasses;
class Outer{
	public void show() {
		System.out.println("in outer");
	}
	class Inner{
		public void show() {
			System.out.println("in inner");
		}
	}
}
public class NonStaticInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer objOuter = new Outer();
		Outer.Inner obj2;
obj2 = objOuter.new Inner();
obj2.show();
	}

}
