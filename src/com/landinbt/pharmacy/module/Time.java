package com.landinbt.pharmacy.module;

import java.time.LocalTime;

public class Time {
	//Attributes
	private byte hour;
	private byte minute;
	
	private int toInt() {
		return hour*100 + minute; //1007
	}
	
	private boolean isValid(byte h, byte m) {
		if(h < 0 || h > 23) {
			return false;
		}
		
		if(m < 0 || m > 59) {
			return false;
		}
		
		return true;
	}
	
	//Methods
	public Time() {
		LocalTime now = LocalTime.now();
		this.hour = (byte) now.getHour();
		this.minute = (byte) now.getMinute();
	}
	
	public Time(Time t) {
		this.hour = t.hour;
		this.minute = t.minute;
	}
	
	public void setHour(byte h) {
		if(isValid(h, this.minute)) {
			this.hour = h;
		}
	}
	
	public void setMinute(byte m) {
		if(isValid(this.hour, m)) {
			this.minute = m;
		}
	}
	
	public String toString() {
		return String.format("%02d:%02d", hour, minute);
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
