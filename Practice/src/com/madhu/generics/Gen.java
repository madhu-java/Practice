package com.madhu.generics;
class Demo<T>{
	T objT;
	public Demo(T objT) {
		this.objT =objT;
	}
	public void setobjT(T objT) {
		this.objT = objT;
	}
	public T getObjT() {
		return this.objT;
	}
	public void show() {
		System.out.println("type of obj="+objT.getClass().getName());
	}
}
public class Gen {

	public static void main(String[] args) {
		Demo<Integer> inDemo= new Demo(10);
		Demo<String> strDemo= new Demo("mahu");
		System.out.println(inDemo.getObjT());
		inDemo.show();
		System.out.println(strDemo.getObjT());
		strDemo.show();
		Demo<Double> doubleDemo = new Demo(10.984);
		doubleDemo.show();
		System.out.println(doubleDemo.getObjT());
		

	}

}
