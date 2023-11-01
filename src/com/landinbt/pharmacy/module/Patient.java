package com.landinbt.pharmacy.module;

public class Patient {
	//Attributes
	private long socSecNum; //social security number
	private Name name;
	private Date birth;
	private Address address;
	private long phoneNum;
	
	//Methods
	public Patient(){}
	
	public Patient(Patient p) {
		this.socSecNum = p.socSecNum;
		this.name = p.name;
		this.birth = p.birth;
		this.address = p.address;
		this.phoneNum = p.phoneNum;
	}
	
	public void setSocSecNum(long ssn) {
		this.socSecNum = ssn;
	}
	
	public void setName(Name n) {
		this.name = n;
	}
	
	public void setBirth(Date d) {
		this.birth = d;
	}
	
	public void setAddress(Address a) {
		this.address = a;
	}
	
	public void setPhoneNum(long pn) {
		this.phoneNum = pn;
	}
	
	public String toString() {
		//85760032309 to 8576003230-9
		String strSSN = String.format("%011d", socSecNum);
		String socSecNumStr = strSSN.substring(0, 10)+
				"-"+strSSN.substring(10, 11);
		
		//8335736729 to 83 3573 6729
		String strPN = String.format("%010d", phoneNum);
		String phoneNumStr = strPN.substring(0, 2)+" "+
		strPN.substring(2, 6)+" "+
		strPN.substring(6, 10);
		
		return socSecNumStr+'\n'+
				name.toString()+'\n'+
				birth.toString()+'\n'+
				address.toString()+'\n'+
				phoneNumStr;
	}
	
	public long getSocSecNum() {
		return socSecNum;
	}
	
	public Name getName() {
		return name;
	}
	
	public Date getBirth() {
		return birth;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public long getPhoneNum() {
		return phoneNum;
	}
	
	public boolean equals(Patient p) {
		return this.socSecNum == p.socSecNum; // ==
	}
			
	public boolean notEquals(Patient p) {
		return !this.equals(p); // !=
	}
			
	public boolean isLessThan(Patient p) {
		return this.socSecNum < p.socSecNum; // <
	}
			
	public boolean isLessThanOrEqual(Patient p) {
		return isLessThan(p) || equals(p); // <=
	}
			
	public boolean isGreaterThan(Patient p) {
		return !isLessThanOrEqual(p); // >
	}
			
	public boolean isGreaterThanOrEqual(Patient p) {
		return !isLessThan(p); // >=
	}
	
}
