package com.madhu.onetomany;
//target object
public class Department {
private int did;
private String dname;
//Has-A relation
private Employee[] employee;
public Department(int did, String dname, Employee[] employee) {
	super();
	this.did = did;
	this.dname = dname;
	this.employee = employee;
}
public void getDepartmentDetails() {
	System.out.println("Department details:");
	System.out.println("Department id:"+did);
	System.out.println("Department name:"+dname);
	System.out.println("..............................");
	for (Employee e : employee) {
		System.out.println("employee id:"+e.eid);
		System.out.println("employee id:"+e.ename);
		System.out.println("employee id:"+e.eaddr);
		
		
	}
}

}
