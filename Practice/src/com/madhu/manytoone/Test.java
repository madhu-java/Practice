package com.madhu.manytoone;

public class Test {

	public static void main(String[] args) {
		Branch branch = new Branch(100, "SSS");
		Student s1 = new Student(1,	 "aaa", branch);
		Student s2 = new Student(2,	 "bbb", branch);
		Student s3 = new Student(3,	 "ccc", branch);
		
     s1.getStudnetInfo();
     s2.getStudnetInfo();
     s3.getStudnetInfo();
	}

}
