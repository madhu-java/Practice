package com.madhu.onetoone;

public class Address {
private String addressLine1;
private String addressLine2;
public Address(String addressLine1, String addressLine2) {
	super();
	this.addressLine1 = addressLine1;
	this.addressLine2 = addressLine2;
}
public String getAddressLine1() {
	return addressLine1;
}
public String getAddressLine2() {
	return addressLine2;
}

}
