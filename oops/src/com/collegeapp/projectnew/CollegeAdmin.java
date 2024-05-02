package com.collegeapp.projectnew;
import java.sql.SQLException;
import java.util.*;
public class CollegeAdmin {
	
	public static void psnaAdmin()
	{
		CollegeManagementApp collegeManagementApp=new CollegeManagementApp();
		AbstractExtend abstractextend=new AbstractExtend();
		Scanner s=new Scanner(System.in);
		String adminNamePsna="Psna";
		String adminPasswordPsna="Psna@1";
		System.out.println("Enter the admin name:");
		collegeManagementApp.adminName=s.next();
		System.out.println("Enter the admin password:");
		collegeManagementApp.adminPassword=s.next();
		while(!(collegeManagementApp.adminName.matches(adminNamePsna)))
		{
			System.out.println("Enter the correct admin name:");
			collegeManagementApp.adminName=s.next();
			
		}
		while(!collegeManagementApp.adminPassword.matches(adminPasswordPsna))
		{
			System.out.println("Enter the correct admin password:");
			collegeManagementApp.adminPassword=s.next();
		}
		abstractextend.welcome();
		System.out.println("---Welcome Admin---");
		System.out.println("---LOGIN SUCCESSFUL---");
		System.out.println("whether you need to add extra features(1.yes/2.no):");
		int option=s.nextInt();
		if(option<0)
		{
			System.out.println("whether you need to add extra features(1.yes/2.no):");
			option=s.nextInt();
		}
		switch(option)
		{
		   case 1:
			   System.out.println("---Features can be added---");
			   System.out.println("select option to add features(1.Placement 2.Ranking 3.companies)");
			   int o=s.nextInt();
			   if(o<0)
			   {
				   System.out.println("select option to add features(1.Placement 2.Ranking 3.companies)");
				    o=s.nextInt();
			   }
			   switch(o)
			   {
			   case 1:
				   System.out.println("please enter the current year overall placement percentage:");
				   double percent=s.nextDouble();
				   if(percent<0)
				   {
					   System.out.println("please enter the current year overall placement percentage:");
					   percent=s.nextDouble();
					  
				   }
				   System.out.println("current overall placement percentage of our college is:"+percent);
				   System.out.println("---Thank you features are updated---");
				   break;
			   case 2:
				   System.out.println("please enter the updated new ranking of the college:");
				   int rank=s.nextInt();
				   if(rank<0)
				   {
					   System.out.println("please enter the  updated new ranking of the college:");
					   rank=s.nextInt();
					  
				   }
				   System.out.println("current ranking of our college is:"+rank);
				   System.out.println("---Thank you features are updated---");
				   break;
			   case 3:
				   System.out.println("please enter the total number of companies visited at our college:");
				   int company=s.nextInt();
				   if(company<0)
				   {
					   System.out.println("please enter the total number of companies visited at our college:");
					   company=s.nextInt();
				   }
				   System.out.println("Total number of companies visited at our college for current year:"+company);
				   System.out.println("---Thank you features are updated---");
				   break;
			   }
			   
			   break;
		   case 2:
			   System.out.println("---Thank you No features are added---");
			   break;
		}
		
		
		abstractextend.thankYou();
		
	}
	public static void psnaUser() throws ClassNotFoundException, SQLException
	{
		CollegeManagementApp cm=new CollegeManagementApp();
		AbstractExtend abstractextend=new AbstractExtend();
	    Scanner scan=new Scanner(System.in);
	    String userNamePsna="^[a-zA-Z]+$";
		String userPasswordPsna="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{11}$";
	    abstractextend.welcome();
		System.out.println("Whether you are 1.new user 2.existing user ");
	    int option=scan.nextInt();
	    if(option<0)
	    {
	    	System.out.println("Whether you are 1.new user 2.existing user ");
		    option=scan.nextInt();
	    }
	    if(option==1)
	    {
	    	System.out.println("---SIGN UP PAGE---");
	    	System.out.println("create userName:");
	    	cm.userName1=scan.next();
	    	while(!(cm.userName1.matches(userNamePsna)))
	    	{
	    		System.out.println("create userName:");
		    	 cm.userName1=scan.next();
	    	}
	    	System.out.println("create userPassword:");
	    	cm.userPassword1=scan.next();
	    	while(!(cm.userPassword1.matches(userPasswordPsna)))
	    	{
	    		System.out.println("create userPassword:");
		    	 cm.userPassword1=scan.next();
	    	}
	    	System.out.println("---SIGN UP SUCCESSFUL---");
	    }
	    else if(option==2)
	    {
	    	System.out.println("---LOGIN PAGE---");
	    	System.out.println("Enter the user name:");
	        cm.userName2=scan.next();
	
	    	while(!(cm.userName2.matches(userNamePsna)))
	    	{
	    		System.out.println("Enter the user name:");
		    	 cm.userName2=scan.next();
	    	}
	    	System.out.println("Enter the user password:");
	    	 cm.userPassword2=scan.next();
	    	 while(!(cm.userPassword2.matches(userPasswordPsna)))
		    	{
		    		System.out.println("Enter the user name:");
			    	 cm.userName2=scan.next();
		    	}
	    	 System.out.println("---LOGIN SUCCESSFUL---");
	    		
	    }
	    
		System.out.println("---Welcome User---");
		System.out.println("enter your roll number:");
		int rollNo=scan.nextInt();
		if(rollNo<0)
		{
			System.out.println("Enter your roll number:");
			rollNo=scan.nextInt();
		}
		
		System.out.println("Enter your attendance percentage:");
		int percent=scan.nextInt();
		if(percent<0)
		{
			System.out.println("Enter your attendance percentage:");
			 percent=scan.nextInt();
		}
		if(percent>70)
		{
			System.out.println("you are eligible to write the exam");
		}
		else
		{
			System.out.println("pay Rs.100 to attend the exam");
		}
		System.out.println("Enter your name:");
		String name=scan.next();
		while(!name.matches(userNamePsna))
		{
			System.out.println("Enter your name:");
			 name=scan.next();
		}
		System.out.println("Enter the college fees you have paid already:");
		int paidFees=scan.nextInt();
		if(paidFees<0)
		{
			System.out.println("Enter the college fees you have paid already:");
			paidFees=scan.nextInt();
		}
		CollegeApp.CollegeDetails(name,paidFees);
		System.out.println("select 1.insert\n 2.update\n 3.delete  to make changes in the database:");
		int choice=scan.nextInt();
		if(choice<0)
		{
			System.out.println("select 1.insert\n 2.update\n 3.delete  to make changes in the database:");
			choice=scan.nextInt();
		}
		switch(choice)
		{
		case 1:
			DataBase.insert(rollNo, percent, paidFees);
			break;
		case 2:
			DataBase.update(rollNo, percent,paidFees);
			break;
		case 3:
			DataBase.delete(rollNo);
			break;
			default:
				System.out.println("wrong choice");
		}
		abstractextend.thankYou();		
		
}
}

