package com.madhu.generics;
class Sample<T extends Number>{
	T objT;
	public Sample(T objT) {
		this.objT=objT;
	}
	public T getObjT() {
		return objT;
	}
}
class ThreadMY <T extends Runnable>
{}//we use extends with interface also for type
public class GenricsType {

	public static void main(String[] args) {
		Sample<Integer> iSample= new Sample(10);
		Sample<Number> numSample = new Sample(10.987);
		////Sample<String> strSample = new Sample("madhu");
//it takes either Number type or it'd child typres only
		System.out.println(iSample.getObjT());
		System.out.println(numSample.getObjT());
	}

}
