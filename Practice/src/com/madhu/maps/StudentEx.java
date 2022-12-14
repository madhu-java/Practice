package com.madhu.maps;

import java.util.HashMap;

class Student{
	private int id;
	private String name;
	private String course;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	public Student(int id, String name,String course) {
		this.id=id;
		this.name=name;
		this.course= course;
	}
	
	
}
public class StudentEx {

	public static void main(String[] args) {

Student st1=new Student(100, "aaa", "AAAA");
Student st2=new Student(10, "bbb", "BBBB");
Student st3=new Student(200, "ccc", "CCCC");
HashMap hMap= new HashMap();
hMap.put(1, st1);
hMap.put(2, st2);
hMap.put(3, st3);
System.out.println(hMap);

	}

}
