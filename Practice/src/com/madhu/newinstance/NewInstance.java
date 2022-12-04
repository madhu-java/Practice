package com.madhu.newinstance;
class Student{
	int id;
	int name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	
}
public class NewInstance {

	public static void main(String[] args)throws Exception {
		String className = args[0];
//		Class class1 =Class.forName(className);
//		Object object = class1.newInstance();
		Object object = Class.forName(className).newInstance();
		Student student = (Student)object;
		student.setId(100);
		student.getId();
		Student student2 = new Student();
		student2.setId(200);
		student2.getId();
		
		

	}

}
