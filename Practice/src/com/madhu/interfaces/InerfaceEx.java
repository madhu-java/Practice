package com.madhu.interfaces;

import java.util.Scanner;

interface ISample{
	void input();
	public abstract void compute();
	int display();
}
class  SampleImpl implements ISample{
	int a,b,sum;
	 public void input() {
		a=10;b=20;
	}
	public void compute(){
		sum=a*b;
	}
	public int display() {
		return sum;
	}
}
public class InerfaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleImpl sampleImpl = new SampleImpl();
		sampleImpl.input();
		sampleImpl.compute();
		System.out.println(sampleImpl.display());

	}

}
