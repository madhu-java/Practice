package com.madhu.exceptions;

import java.util.Scanner;

public class ThrowsEx {
	Scanner scanner = new Scanner(System.in);
	public void welcome() throws ArithmeticException
	{
		System.out.println("WElcome, please enter your name:");
		
		String string = scanner.next().replace('a', 'A');
		
		System.out.println(100/0);
		System.out.println(string);
		}
	public void greet() throws ArithmeticException{
		welcome();
	}

	public static void main(String[] args) {
		ThrowsEx throwsEx = new ThrowsEx();
		
		try {
			throwsEx.greet();
			}
			catch(ArithmeticException e) {
				System.out.println(e.toString());
			}
	}

}
