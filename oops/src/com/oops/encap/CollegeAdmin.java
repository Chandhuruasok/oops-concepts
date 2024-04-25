package com.oops.encap;
import java.util.*;
public class CollegeAdmin {
	
	public static void psnaAdmin()
	{
		CollegeManagementApp cm=new CollegeManagementApp();
		Scanner s=new Scanner(System.in);
		String adminNamePsna="Psna";
		String adminPasswordPsna="Psna@1";
		System.out.println("Enter the admin name:");
		cm.adminName=s.next();
		System.out.println("Enter the admin password:");
		cm.adminPassword=s.next();
		while(!(cm.adminName.matches(adminNamePsna)))
		{
			System.out.println("Enter the correct admin name:");
		    cm.adminName=s.next();
			
		}
		while(!cm.adminPassword.matches(adminPasswordPsna))
		{
			System.out.println("Enter the correct admin password:");
		    cm.adminPassword=s.next();
		}
		System.out.println("---Welcome Admin---");
		System.out.println("whether you need to add extra features(1.yes/2.no):");
		int option=s.nextInt();
		switch(option)
		{
		   case 1:
			   System.out.println("---Features can be added---");
			   System.out.println("select option to add features(1.Placement 2.Ranking)");
			   int o=s.nextInt();
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
			   }
			   break;
		   case 2:
			   System.out.println("---Thank you No features are added---");
			   break;
		}
		
		
	}
	public static void psnaUser()
	{
		CollegeManagementApp cm=new CollegeManagementApp();
	    Scanner scan=new Scanner(System.in);
	    String userNamePsna="^[a-zA-Z]+$";
		String userPasswordPsna="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8}$";
	    System.out.println("Whether you are 1.new user 2.existing user ");
	    int option=scan.nextInt();
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
			System.out.println("Enter your attendance percentage:");
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
		
}
}

