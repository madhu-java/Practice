package com.madhu.onetoone;

public class Employee {
	private int eid;
	private String ename;
	private String eadd;
	private Account account;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEadd() {
		return eadd;
	}
	public void setEadd(String eadd) {
		this.eadd = eadd;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void getEmpDetils() {
		System.out.println("emp id:"+getEid());
		System.out.println("emp name:"+getEname());
		System.out.println("emp address:"+getEadd());
		System.out.println("emp acc no:"+getAccount().getAccNO());
		System.out.println("emp acc name:"+getAccount().getAccName());
		System.out.println("emp acc type:"+getAccount().getAccType());
		
	}

}
