package com.madhu.onetoone;

public class TestOne {

public static void main(String[] args) {
	Address address = new  Address("street1","state1");
	Student student = new Student(10, "madhu", address);
student.getStudentDetails();
}
}