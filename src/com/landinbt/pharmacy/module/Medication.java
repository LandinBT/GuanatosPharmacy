package com.landinbt.pharmacy.module;

public class Medication {
	//Attributes
	private long code;
	private String desc;
	
	//Methods
	public Medication() {}
	
	public Medication(Medication m) {
		this.code = m.code;
		this.desc = m.desc;
	}
	
	public Medication(long c) {
		this.code = c;
	}
	
	public void setCode(long c) {
		this.code = c;
	}
	
	public void setDesc(String d) {
		this.desc = d;
	}
	
	public String toString() {
		//14379199 to 1437-9199
		String strCod = String.format("%08d", code);
		String codeStr = strCod.substring(0, 4)+
				"-"+strCod.substring(4, 8);
		
		return codeStr+'\n'+desc;
	}
	
	public long getCode() {
		return code;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public boolean equals(Medication m) {
		return this.code == m.code;
	}
	
	public boolean notEquals(Medication m) {
		return !this.equals(m); // !=
	}
			
	public boolean isLessThan(Medication m) {
		return this.code < m.code; // <
	}
			
	public boolean isLessThanOrEqual(Medication m) {
		return isLessThan(m) || equals(m); // <=
	}
			
	public boolean isGreaterThan(Medication m) {
		return !isLessThanOrEqual(m); // >
	}
			
	public boolean isGreaterThanOrEqual(Medication m) {
		return !isLessThan(m); // >=
	}
}
