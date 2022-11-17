package com.madhu.onetomany;

public class Test {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"a", "aaaa");
		Employee e2 = new Employee(2,"b", "bbbb");
		Employee e3 = new Employee(3,"c", "cccc");
		Employee[] employees = new Employee[] {e1,e2,e3};
		//constructor injection
		Department department = new Department(100, "Health", employees);
		department.getDepartmentDetails();
		

	}

}
