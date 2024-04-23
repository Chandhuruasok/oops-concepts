package com.oops.encap;
import java.util.*;

public class TestCollegeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CollegeManagementApp cp=new CollegeManagementApp();
		CollegeApp ca=new CollegeApp();
		System.out.println("---1.PSNACET---");
		System.out.println("---2.SSMIET---");
		System.out.println("---3.PSG---");
		System.out.println("---4.KCT---");
		System.out.println("Choose the college  from the above option:");
		int option=scan.nextInt();
		int select;
		switch(option)
		{
		case 1:
			System.out.println("---Welcome to PSNACET---");
			System.out.println("College code is 5901");
			System.out.println("1.Government quota \n 2.Management quota");
			System.out.println("Enter the type of quota:");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
				System.out.println("---Fees structure for Government quota---");
				System.out.println("Fees structure for ECE is 1,00,000");
				System.out.println("Fees structure for CSE is 1,50,000");
				System.out.println("Fees structure for IT is  1,20,000");
				System.out.println("Fees structure for MCA is 1,60,000");
				break;
			case 2:
				System.out.println("---Fees structure for Management quota---");
				System.out.println("Fees structure for ECE is 2,00,000");
				System.out.println("Fees structure for CSE is 2,50,000");
				System.out.println("Fees structure for IT is  2,20,000");
				System.out.println("Fees structure for MCA is 2,60,000");
				break;
			}
			break;
		case 2:
			System.out.println("---Welcome to SSMIET---");
			System.out.println("College code is 5902");
			System.out.println("1.Government quota \n 2.Management quota");
			System.out.println("Enter the type of quota:");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
				System.out.println("---Fees structure for Government quota---");
				System.out.println("Fees structure for ECE is 50,000");
				System.out.println("Fees structure for CSE is 52,000");
				System.out.println("Fees structure for IT is  55,000");
				System.out.println("Fees structure for MCA is 60,000");
				break;
			case 2:
				System.out.println("---Fees structure for Management quota---");
				System.out.println("Fees structure for ECE is 60,000");
				System.out.println("Fees structure for CSE is 62,000");
				System.out.println("Fees structure for IT is  65,000");
				System.out.println("Fees structure for MCA is 70,000");
				break;
			}
			break;
		case 3:
			System.out.println("---Welcome to PSG---");
			System.out.println("College code is 5903");
			System.out.println("1.Government quota \n 2.Management quota");
			System.out.println("Enter the type of quota:");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
				System.out.println("---Fees structure for Government quota---");
				System.out.println("Fees structure for ECE is 4,00,000");
				System.out.println("Fees structure for CSE is 4,50,000");
				System.out.println("Fees structure for IT is  4,70,000");
				System.out.println("Fees structure for MCA is 4,40,000");
				break;
			case 2:
				System.out.println("---Fees structure for Management quota---");
				System.out.println("Fees structure for ECE is 5,00,000");
				System.out.println("Fees structure for CSE is 5,50,000");
				System.out.println("Fees structure for IT is  5,60,000");
				System.out.println("Fees structure for MCA is 5,70,000");
				break;
			}
			break;
		case 4:
			System.out.println("---Welcome to KCT---");
			System.out.println("College code is 5904");
			System.out.println("1.Government quota\n 2.Management quota");
			System.out.println("Enter the type of quota:");
			select=scan.nextInt();
			switch(select)
			{
			case 1:
				System.out.println("---Fees structure for Government quota---");
				System.out.println("Fees structure for ECE is 4,00,000");
				System.out.println("Fees structure for CSE is 4,50,000");
				System.out.println("Fees structure for IT is  4,20,000");
				System.out.println("Fees structure for MCA is 4,60,000");
				break;
			case 2:
				System.out.println("---Fees structure for Management quota---");
				System.out.println("Fees structure for ECE is 5,00,000");
				System.out.println("Fees structure for CSE is 5,50,000");
				System.out.println("Fees structure for IT is  5,20,000");
				System.out.println("Fees structure for MCA is 5,60,000");
				break;
			}
			break;
		}
		System.out.println("Enter the college code:");
		cp.collegeCode=scan.nextLong();
		if(cp.collegeCode<0)
		{
			System.out.println("Enter the college code:");
			cp.collegeCode=scan.nextLong();
		}
		cp.setCollegeCode(cp.collegeCode);
		ca.collegeDetails(cp.getCollegeCode());
		/*cp.collegeName=scan.next();
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
		
		System.out.println("Enter the number of buses:");
		cp.bus=scan.nextInt();
		if(cp.bus<0)
		{
			System.out.println("Enter the number of buses:");
			cp.bus=scan.nextInt();
		}
		System.out.println("whether there is hostel facility are not(Y/N)?");
		cp.hostel=scan.nextBoolean();
		System.out.println("Enter the college code:");
		cp.collegeCode=scan.nextLong();
		if(cp.collegeCode<0)
		{
			System.out.println("Enter the college code:");
			cp.collegeCode=scan.nextLong();
		}
		System.out.println("Enter the Branch code:");
		cp.branchCode=scan.nextLong();
		if(cp.branchCode<0)
		{
			System.out.println("Enter the Branch code:");
			cp.branchCode=scan.nextLong();
		}
		cp.setCollegeName(cp.collegeName);
		cp.setStaff(cp.staff);
		cp.setStudent(cp.student);
		cp.setDepartment(cp.department);
		cp.setBus(cp.bus);
		cp.setHostel(cp.hostel);
		cp.setCollegeCode(cp.collegeCode);
		cp.setBranchCode(cp.branchCode);
		ca.collegeDetails(cp.getCollegeName(), cp.getStaff(), cp.getStudent());
		ca.collegeDetails(cp.getDepartment(), cp.getBus());
		ca.collegeDetails(cp.isHostel());
		switch(cp.collegeName)
		{
		 case "PSNA":
			 System.out.println("Total number of staffs:100");
			 System.out.println("Total number of students:1000");
			 System.out.println("Hostel facility is available here");
			 break;
		case "SSM":
			 System.out.println("Total number of staffs:200");
			 System.out.println("Total number of students:2000");
			 System.out.println("Hostel facility is not available here");
			 break;
		case "KCT":
			 System.out.println("Total number of staffs:300");
			 System.out.println("Total number of students:3000");
			 System.out.println("Hostel facility is available here");
			 break;
		default:
				 System.out.println("wrong college");
	}*/
		/*System.out.println("1.Government quota\n 2.Management quota");
		System.out.println("Enter the type of quota:");
		int select=scan.nextInt();
		switch(select)
		{
		case 1:
			System.out.println("---Fees structure for Government quota---");
			System.out.println("Fees structure for ECE is 1,000,00");
			System.out.println("Fees structure for CSE is 1,500,00");
			System.out.println("Fees structure for IT is 1,200,00");
			System.out.println("Fees structure for MCA is 1,600,00");
			break;
		case 2:
			System.out.println("Fees structure for ECE is 2,00,000");
			System.out.println("Fees structure for CSE is 2,500,00");
			System.out.println("Fees structure for IT is 2,200,00");
			System.out.println("Fees structure for MCA is 2,600,00");
			break;
		}*/
}
}
