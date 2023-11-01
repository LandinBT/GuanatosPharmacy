package com.landinbt.pharmacy.module;

public class Name {
	//Attributes
	private String first;
	private String last;
	
	//Methods
	public Name(){}
	
	public Name(Name n) {
		this.first = n.first;
		this.last = n.last;
	}
	
	public void setFirst(String f) {
		this.first = f;
	}
	
	public void setLast(String l) {
		this.last = l;
	}
	
	public String toString() {
		return last+", "+first;
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getLast() {
		return last;
	}
	
	//Relational
	public boolean equals(Name n) {
		return toString().equals(n.toString());
	}
	
	public boolean notEquals(Name n) {
		return !this.equals(n); // !=
	}
			
	public boolean isLessThan(Name n) {
		return toString().compareTo(n.toString()) < 0; // <
	}
			
	public boolean isLessThanOrEqual(Name n) {
		return isLessThan(n) || equals(n); // <=
	}
			
	public boolean isGreaterThan(Name n) {
		return !isLessThanOrEqual(n); // >
	}
			
	public boolean isGreaterThanOrEqual(Name n) {
		return !isLessThan(n); // >=
	}
}
