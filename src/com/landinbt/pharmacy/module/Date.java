package com.landinbt.pharmacy.module;

public class Date {
	//Attributes
	private byte day;
	private byte month;
	private int year;
	
	private int toInt() {
		return year*10000 + month*100 + day; //20231031
	}
	
	//private boolean isValid(byte d, byte m, int y) {}
	
	//Methods
	Date(){}
	
	Date(Date d) {
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}
	
	public void setDay(byte d) {
		this.day = d;
	}
	
	public void setMonth(byte m) {
		this.month = m;
	}
	
	public void setYear(int y) {
		this.year = y;
	}
	
	public String toString() {
		return day+"/"+month+"/"+year;
	}
	
	public byte getDay() {
		return day;
	}
	
	public byte getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
}
