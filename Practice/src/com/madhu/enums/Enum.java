package com.madhu.enums;
enum Result{
	PASS,FAIL,NR;
	int studentID;
	
	 public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	Result(){
		System.out.println("constructor called");
	}
	
}
public class Enum {

	public static void main(String[] args) {
		Result[] results=Result.values();
		for(Result result:results) {
			System.out.println(result.ordinal()+" : "+result);
		}
		Result.PASS.setStudentID(100);
		System.out.println(Result.PASS.getStudentID());
		System.out.println(Result.FAIL.getStudentID());
	}

}
