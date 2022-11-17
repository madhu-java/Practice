package com.madhu.onetoone;

public class TestTwo {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.setAccName("Ma");
		account.setAccNO(12344);
		account.setAccType("Misc");
		
		//injecting dependent obj with setters
		Employee employee= new Employee();
		employee.setEid(100);
		employee.setEname("Madhu");
		employee.setEadd("address1");
		employee.setAccount(account);
		
		employee.getEmpDetils();

		
		}

}
