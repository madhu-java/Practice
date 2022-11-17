package com.madhu.onetoone;

public class Student {
	private int sid;
	private String sname;
	
	private Address address;
	
	//construction injection
	public Student(int sid, String sname, Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	public void getStudentDetails() {
		System.out.println("student id:"+sid);
		System.out.println("Student name:"+sname);
		System.out.println("student address: "+address.getAddressLine1()+" "+address.getAddressLine2());
	}
	

}
