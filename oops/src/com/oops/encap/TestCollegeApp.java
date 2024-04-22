package com.oops.encap;
import java.util.*;

public class TestCollegeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CollegeManagementApp cp=new CollegeManagementApp();
		CollegeApp ca=new CollegeApp();
		System.out.println("Enter the college name:");
		cp.collegeName=scan.next();
		String collegeNameCheck="^[a-zA-z]+$";
		while(!cp.collegeName.matches(collegeNameCheck))
		{
			System.out.println("Enter the college name correctly:");
			cp.collegeName=scan.next();
		}
		System.out.println("Enter the number of staffs working:");
		cp.staff=scan.nextInt();
		if(cp.staff<0)
		{
			System.out.println("Enter the number of staffs working again:");
			cp.staff=scan.nextInt();
		}
		System.out.println("Enter the number of students pursuing:");
		cp.student=scan.nextInt();
		if(cp.student<0)
		{
			System.out.println("Enter the number of students pursuing again:");
			cp.student=scan.nextInt();
		}
		System.out.println("Enter the number of departments:");
		cp.department=scan.nextInt();
		if(cp.department<0)
		{
			System.out.println("Enter the number of departments again:");
			cp.department=scan.nextInt();
		}
		System.out.println("Enter the college fees :");
		cp.fees=scan.nextLong();
		if(cp.fees<0)
		{
			System.out.println("Enter the college fees again:");
			cp.fees=scan.nextLong();
		}
		System.out.println("Enter the number of buses:");
		cp.bus=scan.nextInt();
		if(cp.bus<0)
		{
			System.out.println("Enter the number of buses:");
			cp.bus=scan.nextInt();
		}
		System.out.println("whether there is hostel facility are not(Y/N)?");
		cp.hostel=scan.nextBoolean();
		cp.setCollegeName(cp.collegeName);
		cp.setStaff(cp.staff);
		cp.setStudent(cp.student);
		cp.setDepartment(cp.department);
		cp.setFees(cp.fees);
		cp.setBus(cp.bus);
		cp.setHostel(cp.hostel);
		ca.collegeDetails(cp.getCollegeName(), cp.getStaff(), cp.getStudent());
		ca.collegeDetails(cp.getDepartment(), cp.getFees(), cp.getBus());
		ca.collegeDetails(cp.hostel);
	}

}
