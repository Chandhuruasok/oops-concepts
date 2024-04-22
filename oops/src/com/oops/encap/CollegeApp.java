package com.oops.encap;

public class CollegeApp {
	public void collegeDetails(String collegeName,int staffs,int students)
	{
		System.out.println("Number of staffs: "+staffs+" and the students: "+students+" are there in this college : "+collegeName);
		
	}
	public void collegeDetails(int department,long fees,int bus)
	{
		System.out.println("number of departments in this college is: "+department+" and the average college fees for government quota is: "+fees);
		System.out.println("Number of buses provided by the college to pickup the dayscholars are: "+bus);
	}
	public void collegeDetails(boolean hostel)
	{
		if(hostel==true)
		System.out.println("Hostel facility is present:"+hostel);
		else
			System.out.println("hostel facility not available:"+hostel);
	}

}
