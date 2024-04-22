package com.oops.encap;

public class CollegeManagementApp {
	String collegeName;
	int staff,student,department,bus;
	long fees;
	boolean hostel;
	public CollegeManagementApp()
	{
		
	}
	public CollegeManagementApp(String collegeName, int staff, int student, int department, int bus, long fees,
			boolean hostel) {
		super();
		this.collegeName = collegeName;
		this.staff = staff;
		this.student = student;
		this.department = department;
		this.bus = bus;
		this.fees = fees;
		this.hostel = hostel;
		
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getStaff() {
		return staff;
	}
	public void setStaff(int staff) {
		this.staff = staff;
	}
	public int getStudent() {
		return student;
	}
	public void setStudent(int student) {
		this.student = student;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getBus() {
		return bus;
	}
	public void setBus(int bus) {
		this.bus = bus;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public boolean isHostel() {
		return hostel;
	}
	public void setHostel(boolean hostel) {
		this.hostel = hostel;
	}
	@Override
	public String toString() {
		return "CollegeManagementApp [collegeName=" + collegeName + ", staff=" + staff + ", student=" + student
				+ ", department=" + department + ", bus=" + bus + ", fees=" + fees + ", hostel=" + hostel + "]";
	}
	
	
}
