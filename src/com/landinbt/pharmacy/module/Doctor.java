package com.landinbt.pharmacy.module;

public class Doctor {
	//Attributes
	private long empCode; //employee code
	private Name name;
	private long certificate;
	private Time arrival;
	private Time departure;
	
	//Methods
	public Doctor(){}
	
	public Doctor(Doctor d) {
		this.empCode = d.empCode;
		this.name = d.name;
		this.certificate = d.certificate;
		this.arrival = d.arrival;
		this.departure = d.departure;
	}
	
	public void setEmpCode(long ec) {
		this.empCode = ec;
	}
	
	public void setName(Name n) {
		this.name = n;
	}
	
	public void setCertificate(long c) {
		this.certificate = c;
	}
	
	public void setArrival(Time a) {
		this.arrival = a;
	}
	
	public void setDeparture(Time d) {
		this.departure = d;
	}
	
	public String toString() {
		//872202565 to 87-2202565
		String strEC = String.format("%09d", empCode);
		String empCodeStr = strEC.substring(0, 2)+
				"-"+strEC.substring(2, 9);
		
		return empCodeStr+'\n'+
				name.toString()+'\n'+
				certificate+'\n'+
				arrival.toString()+" | "+
				departure.toString();
	}
	
	public long getEmpCode() {
		return empCode;
	}
	
	public Name getName() {
		return name;
	}
	
	public long getCertificate() {
		return certificate;
	}
	
	public Time getArrival() {
		return arrival;
	}
	
	public Time getDeparture() {
		return departure;
	}
	
	public boolean equals(Doctor d) {
		return this.empCode == d.empCode; // ==
	}
			
	public boolean notEquals(Doctor d) {
		return !this.equals(d); // !=
	}
			
	public boolean isLessThan(Doctor d) {
		return this.empCode < d.empCode; // <
	}
			
	public boolean isLessThanOrEqual(Doctor d) {
		return isLessThan(d) || equals(d); // <=
	}
			
	public boolean isGreaterThan(Doctor d) {
		return !isLessThanOrEqual(d); // >
	}
			
	public boolean isGreaterThanOrEqual(Doctor d) {
		return !isLessThan(d); // >=
	}

}
