package com.madhu.exceptions;

public class Exception1 {
	public void  divide(int a,int b) {
		try {
		double res = a/b;
		System.out.println( res);
		}
		
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		catch(ArithmeticException e){//this catch is unreachable
//			System.out.println(e);
//		}
		
		System.out.println("You have division successfully");
		
	}

	public static void main(String[] args) {
		Exception1 exception1 =  new Exception1();
		exception1.divide(10,10);
		exception1.divide(10,0);

	}

}
