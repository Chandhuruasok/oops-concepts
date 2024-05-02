package com.collegeapp.projectnew;
import java.sql.SQLException;
import java.util.*;

public class TestCollegeApp {
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner scanner=new Scanner(System.in);
		CollegeManagementApp collegeManage=new CollegeManagementApp();
		CollegeApp collegeApp=new CollegeApp();
		System.out.println("---COLLEGE MANAGEMENT APP---");
		System.out.println("select \n 1.admin\n 2.user");
		collegeManage.selectOption=scanner.nextInt();
		if(collegeManage.selectOption<0)
		{
			System.out.println("select \n 1.admin\n 2.user");
			collegeManage.selectOption=scanner.nextInt();
		}
		
		
		switch(collegeManage.selectOption)
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
		collegeManage.collegeCode=scanner.nextLong();
		if(collegeManage.collegeCode<0)
		{
			System.out.println("Enter the college code:");
			collegeManage.collegeCode=scanner.nextLong();
		}
		
		collegeManage.setCollegeCode(collegeManage.collegeCode);
		collegeApp.collegeDetails(collegeManage.getCollegeCode());
		collegeManage.setSelectOption(collegeManage.selectOption);
		scanner.close();
}
}
