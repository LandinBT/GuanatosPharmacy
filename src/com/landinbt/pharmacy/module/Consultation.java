package com.landinbt.pharmacy.module;

public class Consultation {
	//Attributes
	private Date date;
	private Time time;
	private String diagCode; //diagnosis code
	private String therapIndic; //therapeutic indications
	private String docEmpCode; // doctor employee code
	private String patSSN; //patient social security number
	private String med1Code; //medication 1 code
	private String med2Code; //medication 2 code
	private String med3Code; //medication 3 code
	
	//Methods
	public Consultation() {}
	
	public Consultation(Consultation c) {
		this.date = c.date;
		this.time = c.time;
		this.diagCode = c.diagCode;
		this.therapIndic = c.therapIndic;
		this.docEmpCode = c.docEmpCode;
		this.patSSN = c.patSSN;
		this.med1Code = c.med1Code;
		this.med2Code = c.med2Code;
		this.med3Code = c.med3Code;
	}
	
	public void setDate(Date d) {
		this.date = d;
	}
	
	public void setTime(Time t) {
		this.time = t;
	}
	
	public void setDiagCode(String c) {
		this.diagCode = c;
	}
	
	public void setTherapIndic(String ti) {
		this.therapIndic = ti;
	}
	
	public void setDocEmpCode(String ec) {
		this.docEmpCode = ec;
	}
	
	public void setPatSSN(String ssn) {
		this.patSSN = ssn;
	}
	
	public void setMed1Code(String c) {
		this.med1Code = c;
	}
	
	public void setMed2Code(String c) {
		this.med2Code = c;
	}
	
	public void setMed3Code(String c) {
		this.med3Code = c;
	}
	
	public boolean equals(Consultation c) {
		return therapIndic.equals(c.therapIndic);
	}
	
	public boolean notEquals(Consultation c) {
		return !this.equals(c); // !=
	}
			
	public boolean isLessThan(Consultation c) {
		return therapIndic.compareTo(c.therapIndic) < 0; // <
	}
			
	public boolean isLessThanOrEqual(Consultation c) {
		return isLessThan(c) || equals(c); // <=
	}
			
	public boolean isGreaterThan(Consultation c) {
		return !isLessThanOrEqual(c); // >
	}
			
	public boolean isGreaterThanOrEqual(Consultation c) {
		return !isLessThan(c); // >=
	}
	
}
