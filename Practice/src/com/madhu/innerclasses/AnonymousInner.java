package com.madhu.innerclasses;
abstract class Demo{
	abstract public void config();
}
public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo() {
     public void config() {
		System.out.println("in annonymus class");
	}
     
	};
	demo.config();

}
}
