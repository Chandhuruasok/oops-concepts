package com.oops.encap;
import java.util.*;
public class CollegeApp {
	//CollegeAdmin c=new CollegeAdmin();
	public void collegeDetails(long collegeCode)
	{
		if(collegeCode==5901)
		{
			
			System.out.println("Number of staffs working in our college is:500");
			System.out.println("Number of students pursuing in our college is:5000");
			System.out.println("Hostel facility is available");
			System.out.println("Bus facility is available for dayscholars");
		}
		
		else
		{
			System.out.println("Wrong college code");
		}
		}
	
	public static void CollegeDetails(String name,long paidFees)
	{
		Scanner scan=new Scanner(System.in);
		long collegeFees=100000;
		
		long remFees=collegeFees-paidFees;
		System.out.println(name+" remaining college fees to be paid by you is:"+remFees);
		
	}
}
	
		
		
	
	
	
