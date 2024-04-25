package com.oops.encap;
import java.util.*;

public class TestCollegeApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		CollegeManagementApp cp=new CollegeManagementApp();
		CollegeApp ca=new CollegeApp();
		System.out.println("---COLLEGE MANAGEMENT APP---");
		System.out.println("select \n 1.admin\n 2.user");
		cp.selectOption=scan.nextInt();
		if(cp.selectOption<0)
		{
			System.out.println("select \n 1.admin\n 2.user");
			cp.selectOption=scan.nextInt();
		}
		
		
		switch(cp.selectOption)
		{
			case 1:
			CollegeAdmin.psnaAdmin();
			break;
			case 2:
				CollegeAdmin.psnaUser();
				break;
			default:
				System.out.println("Invalid option");
				
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
		cp.setSelectOption(cp.selectOption);
		scan.close();
}
}
