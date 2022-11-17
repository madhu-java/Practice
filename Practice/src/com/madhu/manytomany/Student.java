package com.madhu.manytomany;
//target obj
public class Student {
private  int sid;
private String sname;
private Course[] course;
public Student(int sid, String sname, Course[] course) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.course = course;
}
public void getStudentInfo() {
	System.out.println("student info:");
	System.out.println("student id:"+sid);
	System.out.println("student name:"+sname);
	System.out.println("course info:");
	for (Course course2 : course) {
		System.out.println("course id:"+course2.cid);
		System.out.println("course name:"+course2.cname);
	}
	
}
}
