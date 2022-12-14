package com.madhu.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
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
System.out.println("using values");
Collection collection=hMap.values();
Iterator itr1=collection.iterator();
while(itr1.hasNext()) {
	System.out.println(itr1.next());
}
System.out.println("usin keySet");
Set set=hMap.keySet();
Iterator itr2=set.iterator();
while(itr2.hasNext()) {
	System.out.println(itr2.next());
}
System.out.println("using entryset");
Set set2=hMap.entrySet();
Iterator iterator=set2.iterator();
while(iterator.hasNext()) {
	Map.Entry data=(Entry) iterator.next();
	System.out.println("key:"+data.getKey()+" "+"value:"+data.getValue());
}

	}

}
