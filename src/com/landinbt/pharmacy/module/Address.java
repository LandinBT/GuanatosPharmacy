package com.landinbt.pharmacy.module;

public class Address {
	//Attributes
	private String street;
	private int houseNum; //house number
	private String colony;
	private int zipCode;
	private String locality;
	
	//Methods
	public Address(){}
	
	public Address(Address a) {
		this.street = a.street;
		this.houseNum = a.houseNum;
		this.colony = a.colony;
		this.zipCode = a.zipCode;
		this.locality = a.locality;
	}
	
	public void setStreet(String s) {
		this.street = s;
	}
	
	public void setHouseNum(int hn) {
		this.houseNum = hn;
	}
	
	public void setColony(String c) {
		this.colony = c;
	}
	
	public void setZipCode(int zc) {
		this.zipCode = zc;
	}
	
	public void setLocality(String l) {
		this.locality = l;
	}
	
	public String toString() {
		return street+" "+houseNum+", "
				+colony+", "+
				zipCode+" "+locality;
	}
	
	public String getStreet() {
		return street;
	}
	
	public int getHouseNum() {
		return houseNum;
	}
	
	public String getColony() {
		return colony;
	}
	
	public int getZipCode() {
		return zipCode;
	}
	
	public String getLocality() {
		return locality;
	}
	
	//Relational
	public boolean equals(Address a) {
		return toString().equals(a.toString()); // ==
	}
			
	public boolean notEquals(Address a) {
		return !this.equals(a); // !=
	}
			
	public boolean isLessThan(Address a) {
		return toString().compareTo(a.toString()) < 0; // <
	}
			
	public boolean isLessThanOrEqual(Address a) {
		return isLessThan(a) || equals(a); // <=
	}
			
	public boolean isGreaterThan(Address a) {
		return !isLessThanOrEqual(a); // >
	}
			
	public boolean isGreaterThanOrEqual(Address a) {
		return !isLessThan(a); // >=
	}

}
