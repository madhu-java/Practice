package com.madhu.manytoone;
//target object
public class Student {
	private int sid;
	private String sname;
	private Branch branch;
	public Student(int sid, String sname,Branch branch) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.branch=branch;
	}
	public void getStudnetInfo() {
		System.out.println("student info");
		System.out.println("student id:"+sid);
		System.out.println("student sname:"+sname);
		System.out.println("branch id:"+branch.bid);
		System.out.println("branch name:"+branch.bname);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1");
	}
	

}
