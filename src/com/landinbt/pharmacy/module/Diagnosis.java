package com.landinbt.pharmacy.module;

public class Diagnosis {
	//Attributes
	private String code;
	private String desc; //description
	
	//Methods
	public Diagnosis(){}
	
	public Diagnosis(Diagnosis d) {
		this.code = d.code;
		this.desc = d.desc;
	}
	
	public void setCode(String c) {
		this.code = c;
	}
	
	public void setDesc(String d) {
		this.desc = d;
	}
	
	public String toString() {
		return code+'\n'+desc;
	}
	
	public String getCode() {
		return code;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public boolean equals(Diagnosis d) {
		return toString().equals(d.toString());
	}
	
	public boolean notEquals(Diagnosis d) {
		return !this.equals(d); // !=
	}
			
	public boolean isLessThan(Diagnosis d) {
		return toString().compareTo(d.toString()) < 0; // <
	}
			
	public boolean isLessThanOrEqual(Diagnosis d) {
		return isLessThan(d) || equals(d); // <=
	}
			
	public boolean isGreaterThan(Diagnosis d) {
		return !isLessThanOrEqual(d); // >
	}
			
	public boolean isGreaterThanOrEqual(Diagnosis d) {
		return !isLessThan(d); // >=
	}

}
