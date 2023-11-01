package com.landinbt.pharmacy.module;

import java.time.LocalDate;

public class Date {
	//Attributes
	private byte day;
	private byte month;
	private int year;
	
	private int toInt() {
		return year*10000 + month*100 + day; //20231031
	}
	
	private boolean isValid(byte d, byte m, int y) {
		if(d < 1 || d > 31) {
			return false;
		}
		
		if(m < 1 || m  > 12) {
			return false;
		}
		
		if(y < 1900 || y > 3000) {
			return false;
		}
		
		//Check for February
		if(m == 2) {
			//Check if year is a leap year
			if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				//February has 29 days in a leap year
				if(d > 29) {
					return false;
				}
			}
			else {
				//February has 28 days in a non-leap year
				if(d > 28) {
					return false;
				}
			}
		}
		
		//Check for months with only 30 days
		if(m == 4 || m == 6 || m == 9 || m == 11) {
			if(d > 30) {
				return false;
			}
		}
		
		return true;
	}
	
	//Methods
	public Date() {
		LocalDate now = LocalDate.now();
		this.day = (byte) now.getDayOfMonth();
		this.month = (byte) now.getMonthValue();
		this.year = (int) now.getYear();
	}
	
	public Date(Date d) {
		this.day = d.day;
		this.month = d.month;
		this.year = d.year;
	}
	
	public void setDay(byte d) {
		if(isValid(d, this.month, this.year)) {
			this.day = d;
		}
	}
	
	public void setMonth(byte m) {
		if(isValid(this.day, m, this.year)) {
			this.month = m;
		}
	}
	
	public void setYear(int y) {
		if(isValid(this.day, this.month, y)) {
			this.year = y;
		}
	}
	
	public String toString() {
		return String.format("%02d/%02d/%04d", day, month, year);
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
	
	//Relational
	public boolean equals(Date d) {
		return toInt() == d.toInt(); // ==
	}
		
	public boolean notEquals(Date d) {
		return !this.equals(d); // !=
	}
		
	public boolean isLessThan(Date d) {
		return toInt() < d.toInt(); // <
	}
		
	public boolean isLessThanOrEqual(Date d) {
		return isLessThan(d) || equals(d); // <=
	}
		
	public boolean isGreaterThan(Date d) {
		return !isLessThanOrEqual(d); // >
	}
		
	public boolean isGreaterThanOrEqual(Date d) {
		return !isLessThan(d); // >=
	}
		
}
