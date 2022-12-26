package com.madhu.comparator;

import java.util.Comparator;
import java.util.TreeSet;

class Student implements Comparable{
	int sid;
	String name;
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public Student(int sid, String name) {
		this.sid=sid;
		this.name= name;
	}
	@Override
	public int compareTo(Object obj) {
		Student student = (Student)obj;
		int id = this.sid;
		if(id<student.sid)
			return -1;
		else if(id>student.sid)
			return 1;
		else return 0;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	
}
class MyComparator implements Comparator{
	public int compare(Object obj1, Object obj2) {
		Student s1= (Student)obj1;
		Student s2= (Student)obj2;
		return s1.name.compareTo(s2.name);
		
	}
}
public class ComparatorEx1 {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator());
		Student s1= new Student(10, "MMMM");
		Student s2= new Student(20, "AAAA");
		Student s3= new Student(70, "BBBB");
		Student s4= new Student(60, "CCCC");
		treeSet.add(s1);
		treeSet.add(s2);
		treeSet.add(s3);
		treeSet.add(s4);
		System.out.println(treeSet);
		treeSet.forEach(System.out::println);
		

	}

}
