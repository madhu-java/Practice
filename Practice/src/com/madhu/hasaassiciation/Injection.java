package com.madhu.hasaassiciation;
class Student{
	public Integer sid;
	public String sName;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
//	public Student(Integer sid, String sName) {
//		super();
//		this.sid = sid;
//		this.sName = sName;
//	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + "]";
	}
	
	
}
public class Injection {

	public static void main(String[] args) {
		//Student student = new Student(100, "madhu");
		Student student = new Student();
		student.setSid(10);
		student.setsName("mahu");
		
		System.out.println(student);

	}

}
