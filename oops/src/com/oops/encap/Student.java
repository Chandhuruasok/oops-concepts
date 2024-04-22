package com.oops.encap;

public class Student {
	String studentName,location;
	int id;
	String degree;
	public Student()
	{
		
	}
	public Student(String studentName, String location, int id, String degree) {
		super();
		this.studentName = studentName;
		this.location = location;
		this.id = id;
		this.degree = degree;
	}
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String userName) {
		this.studentName = studentName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", location=" + location + ", id=" + id + ", degree=" + degree + "]";
	}
	
	
	
}
