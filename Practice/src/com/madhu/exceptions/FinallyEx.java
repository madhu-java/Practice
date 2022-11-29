package com.madhu.exceptions;

public class FinallyEx {
public void start(int a, int b) {
	try {
		if(a/b>0) {
			System.out.println("connected");
		
		}
	}catch(ArithmeticException e) {
		System.out.println(e.toString());
		System.out.println("we handled the exception");
	}
	finally {
		System.out.println("connection terminated");
	}
}
	public static void main(String[] args) {
		FinallyEx finallyEx = new FinallyEx();
		finallyEx.start(10, 10);
		finallyEx.start(10, 0);
	}

}
