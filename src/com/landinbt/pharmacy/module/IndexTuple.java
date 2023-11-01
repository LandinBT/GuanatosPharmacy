package com.landinbt.pharmacy.module;

public class IndexTuple<T> {
	//Attributes
	private int index;
	private T data;
	
	//Methods
	public IndexTuple(){}
	
	public IndexTuple(IndexTuple<T> t) {
		this.index = t.index;
		this.data = t.data;
	}
	
	public IndexTuple(int idx, T elem) {
		this.index = idx;
		this.data = elem;
	}
	
	public IndexTuple(T elem) {
		this.data = elem;
	}
	
	public void setIndex(int idx) {
		this.index = idx;
	}
	
	public void setData(T elem) {
		this.data = elem;
	}
	
	public int getIndex() {
		return index;
	}
	
	public T getData() {
		return data;
	}
	
	public boolean equals(IndexTuple<T> t) {
		return this.index == t.index;
	}
	
	public boolean notEquals(IndexTuple<T> t) {
		return !this.equals(t); // !=
	}
			
	public boolean isLessThan(IndexTuple<T> t) {
		return this.index < t.index; // <
	}
			
	public boolean isLessThanOrEqual(IndexTuple<T> t) {
		return isLessThan(t) || equals(t); // <=
	}
			
	public boolean isGreaterThan(IndexTuple<T> t) {
		return !isLessThanOrEqual(t); // >
	}
			
	public boolean isGreaterThanOrEqual(IndexTuple<T> t) {
		return !isLessThan(t); // >=
	}
	
}
