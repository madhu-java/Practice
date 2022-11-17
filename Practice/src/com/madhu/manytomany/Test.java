package com.madhu.manytomany;

public class Test {

	public static void main(String[] args) {
		Course c1 = new Course(1, 111);
		Course c2 = new Course(2, 222);
		Course c3 = new Course(3, 333);
		Course[] courses = new Course[3];
		courses[0]= c1;
		courses[1]= c2;
		courses[2]= c3;
		Student s1 = new Student(100, "a", courses);
		Student s2 = new Student(200, "b", courses);
		Student s3 = new Student(300, "c", courses);
		s1.getStudentInfo();
		s2.getStudentInfo();
		s3.getStudentInfo();
		

	}

}
