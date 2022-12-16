package com.madhu.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import javax.print.DocFlavor.INPUT_STREAM;

class PersonalInfo{
	private String name;
	private int age;
	private String city;
	public PersonalInfo(String name,int age, String city){
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return name+" "+age+" "+city;
	}
	
	
}
class InvalidPassportNumber extends Exception{
	public InvalidPassportNumber(String str) {
		// TODO Auto-generated constructor stub
		super(str);
	}
	
}
public class MapExPassport {
	static Integer key;
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a passport number to fetch the information:");
		 key= scanner.nextInt();
	}
public static void checkValidity(HashMap hMap) throws InvalidPassportNumber {
	Set set=hMap.entrySet();
	Iterator itr= set.iterator();
	boolean found= false;
	while(itr.hasNext()) {
		Map.Entry data=(Entry) itr.next();
		
		Integer passportKey =(Integer)data.getKey();
		
		if(key==passportKey) {
			
		System.out.println(data.getValue());
		found=true;
		break;
		}
		
	}
	
	if(!found) {
		InvalidPassportNumber invalidPassportNumber = new InvalidPassportNumber("Invlid passport number");
		throw invalidPassportNumber;
		//System.out.println("passport with "+key+" doesn't exist");
	}

}
	public static void main(String[] args) {
		PersonalInfo p1=new PersonalInfo("Madhu", 7, "Mel");
		PersonalInfo p2=new PersonalInfo("Madhu11", 97, "CBR");
		PersonalInfo p3=new PersonalInfo("Madhu22", 87, "SYD");
		HashMap hMap= new HashMap();
		hMap.put(10, p1);
		hMap.put(20, p2);
		hMap.put(30, p3);
		
		try {
			input();
			
			checkValidity(hMap);
		}catch (Exception e) {
			System.out.println(e.getMessage());

			try {
				input();
				
				checkValidity(hMap);
			}catch (Exception e1) {
				System.out.println(e.getMessage());

				try {
					input();
					
					checkValidity(hMap);
				}catch (Exception e2) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}

}
