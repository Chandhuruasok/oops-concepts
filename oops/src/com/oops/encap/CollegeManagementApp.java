package com.oops.encap;

public class CollegeManagementApp {
	String collegeName;
	int staff,student,department,bus;
	long collegeCode,branchCode;
	boolean hostel;
	public CollegeManagementApp()
	{
		
	}
	public CollegeManagementApp(String collegeName, int staff, int student, int department, int bus, long collegeCode,
			boolean hostel,long branchCode) {
		super();
		this.collegeName = collegeName;
		this.staff = staff;
		this.student = student;
		this.department = department;
		this.bus = bus;
		this. collegeCode=collegeCode;
		this.hostel = hostel;
		this.branchCode=branchCode;
		
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
	public long getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(long collegeCode) {
		this.collegeCode = collegeCode;
	}
	public long getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
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
				+ ", department=" + department + ", bus=" + bus + ", collegeCode=" + collegeCode + ", branchCode="
				+ branchCode + ", hostel=" + hostel + "]";
	}
	
	
	
}
