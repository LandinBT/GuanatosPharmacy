package com.landinbt.pharmacy.module;

public class Name {
	//Attributes
	private String first;
	private String last;
	
	//Methods
	Name(){}
	
	Name(Name n) {
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
}
