package com.oops.encap;

public class Dress {
	String colour;
	int size;
	String dressType;
	Double budget;
	public Dress()
	{
		
	}
	public Dress(String colour, int size, String dressType, Double budget) {
		//super();
		this.colour = colour;
		this.size = size;
		this.dressType = dressType;
		this.budget = budget;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getDressType() {
		return dressType;
	}
	public void setDressType(String dressType) {
		this.dressType = dressType;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Dress [colour=" + colour + ", size=" + size + ", dressType=" + dressType + ", budget=" + budget + "]";
	}
	
	
}
