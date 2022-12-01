package com.madhu.exceptions;

import java.util.Scanner;
public class UserDefinedException {

	public static void main(String[] args) {
		RTO rto = new RTO();
		rto.initialize();
	}
		// TODO Auto-generated method stub

	}



class UnderAgeException extends Exception{
	public UnderAgeException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}
}
class Applicant{
	int age;
	public void inpit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age:");
		this.age = scanner.nextInt();
		}
	void verify() throws UnderAgeException{
		if(age<18) {
			UnderAgeException underAgeException  = new UnderAgeException
					("you are under 18");
			throw underAgeException;
		}
	}
}
class RTO{
	public void initialize() {
		Applicant applicant = new Applicant()
;
		
		try {

			applicant.inpit();
			applicant.verify();
		} catch (UnderAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {

				applicant.inpit();
				applicant.verify();
			} catch (UnderAgeException ex) {
				// TODO Auto-generated catch block
				ex.printStackTrace();
				System.exit(0);
		}
		
	}

	}
}

