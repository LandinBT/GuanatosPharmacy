package com.landinbt.pharmacy.module;

import java.io.Serializable;

public class Time implements Serializable {
	//Attributes
	private byte hour;
	private byte minute;
	
	private int toInt() {
		return hour*100 + minute; //1007
	}
	
	//Methods
	Time(){}
	
	Time(Time t) {
		this.hour = t.hour;
		this.minute = t.minute;
	}
	
	public void setHour(byte h) {
		this.hour = h;
	}
	
	public void setMinute(byte m) {
		this.minute = m;
	}
	
	public String toString() {
		return hour+":"+minute;
	}
	
	public byte getHour() {
		return hour;
	}
	
	public byte getMinute() {
		return minute;
	}
	
	//Relational
	public boolean equals(Time t) {
		return toInt() == t.toInt();
	}
	
	public boolean notEquals(Time t) {
		return !this.equals(t); //!=
	}
	
	public boolean isLessThan(Time t) {
		return toInt() < t.toInt();
	}
	
	public boolean isLessThanOrEqual(Time t) {
		return isLessThan(t) || equals(t); //<=
	}
	
	public boolean isGreaterThan(Time t) {
		return !isLessThanOrEqual(t); //>
	}
	
	public boolean isGreaterThanOrEqual(Time t) {
		return !isLessThan(t); //>=
	}

}
