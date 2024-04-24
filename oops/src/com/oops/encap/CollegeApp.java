package com.oops.encap;

public class CollegeApp {
	/*public void collegeDetails(String collegeName,int staffs,int students)
	{
		System.out.println("Number of staffs: "+staffs+" and the number of students: "+students+" are there in this college : "+collegeName);
		
	}
	public void collegeDetails(int department,int bus)
	{
		System.out.println("number of departments in this college is: "+department+"Total number of bus is:"+bus);
		
	}
	public void collegeDetails(boolean hostel)
	{
		if(hostel==true)
		System.out.println("Hostel facility is available:"+hostel);
		else
			System.out.println("hostel facility not available:"+hostel);
	}*/
	public void collegeDetails(long collegeCode)
	{
		if(collegeCode==5901)
		{
			System.out.println("Average cut-off required to apply for the counselling is 150");
			System.out.println("Number of staffs working in our college is:500");
			System.out.println("Number of students pursuing in our college is:5000");
			System.out.println("Hostel facility is available");
			System.out.println("Bus facility is not available for dayscholars");
		}
		else if(collegeCode==5902)
		{
			System.out.println("Average cut-off required to apply for the counselling is 140");
			System.out.println("Number of staffs working in our college is:100");
			System.out.println("Number of students pursuing in our college is:500");
			System.out.println("Hostel facility is not  available");
			System.out.println("Bus facility is available for dayscholars");
		}
		else if(collegeCode==5903)
		{
			System.out.println("Average cut-off required to apply for the counselling is 190");
			System.out.println("Number of staffs working in our college is:100");
			System.out.println("Number of students pursuing in our college is:1000");
			System.out.println("Hostel facility is available");
			System.out.println("Bus facility is also available for dayscholars");
		}
		else if(collegeCode==5904)
		{
			System.out.println("Average cut-off required to apply for the counselling is 180");
			System.out.println("Number of staffs working in our college is:200");
			System.out.println("Number of students pursuing in our college is:900");
			System.out.println("Hostel facility is available");
			System.out.println("Bus facility is also available for dayscholars");
		}	
		}
	public void collegeDetails(long collegeCode,int cutOff)
	{
		if(collegeCode==5901)
		{
			if(cutOff>=170 && cutOff<=180)
			{
				System.out.println("Available courses  for your cut-off are ECE and CSE");
				System.out.println("On-Campus companies visited for ECE department at our college:");
				System.out.println("1.VTS\n 2.KCS\n 3.K&T\n 4.WAAR TECH");
				System.out.println("On-Campus companies visited for CSE department at our college:");
				System.out.println("1.VTS\n 2.KLENSYS\n 3.K&T\n 4.WAAR TECH");
			}
			else if(cutOff>=160 && cutOff<170)
			{
				System.out.println("Available course for your cut-off is IT ");
				System.out.println("On-Campus companies visited for IT department at our college:");
				System.out.println("1.VISCO\n 2.IBN\n 3.TOOGLE\n 4.MICRO TECHNOLOGIES");
			}
			else if(cutOff>=150 && cutOff<160)
			{
				System.out.println("Available course for your cut-off is MCA ");
				System.out.println("On-Campus companies visited for MCA DEPARTMENT at our college:");
				System.out.println("1.VTS\n 2.KCS\n 3.KLENSYS\n 4.CLOUDFORCE TECHNOLOGIES");
			}
			else 
			{
				System.out.println("No courses available for this cut-off");
			}
		}
		if(collegeCode==5902)
		{
			if(cutOff>=150 && cutOff<=160)
			{
				System.out.println("Available courses  for your cut-off are IT and CSE");
				System.out.println("On-Campus companies visited for IT department at our college:");
				System.out.println("1.VISCO\n 2.MOCH TECHNOLOGIES\n 3.TALO ALTO\n 4.TAKEN TECHNOLOGIES");
				System.out.println("On-Campus companies visited for CSE department at our college:");
				System.out.println("1.VTS\n 2.MAPGEMINI\n 3.K&T\n 4.GOODWELL");
			}
			else if(cutOff>=140 && cutOff<150)
			{
				System.out.println("Available course for your cut-off is ECE ");
				System.out.println("On-Campus companies visited for ECE department at our college:");
				System.out.println("1.VTS\n 2.TEGATO TECH\n 3.K&T\n 4.WAAR TECH");
			}
			else if(cutOff>=130 && cutOff<140)
			{
				System.out.println("Available course for your cut-off is MCA ");
				System.out.println("On-Campus companies visited for MCA DEPARTMENT at our college:");
				System.out.println("1.TEGATO TECH\n 2.HCN\n 3.KLENSYS\n 4.SALES TECHNOLOGIES");
			}
			else 
			{
				System.out.println("No courses available for this cut-off");
			}
		}
		if(collegeCode==5903)
		{
			if(cutOff>=190 && cutOff<=200)
			{
				System.out.println("Available courses for your cut-off are ECE and CSE");
				System.out.println("On-Campus companies visited for ECE department at our college:");
				System.out.println("1.VTS\n 2.TEGATO TECH\n 3.K&T\n 4.WAAR TECH");
			}
			else if(cutOff>=180 && cutOff<190)
			{
				System.out.println("Available course for your cut-off is IT ");
				System.out.println("On-Campus companies visited for IT department at our college:");
				System.out.println("1.VISCO\n 2.MOCH TECHNOLOGIES\n 3.TALO ALTO\n 4.TAKEN TECHNOLOGIES");
			}
			else if(cutOff>=170 && cutOff<180)
			{
				System.out.println("Available course for your cut-off is MCA ");
				System.out.println("On-Campus companies visited for MCA DEPARTMENT at our college:");
				System.out.println("1.TEGATO TECH\n 2.KCS\n 3.KLENSYS\n 4.SALES TECHNOLOGIES");
			}
			else 
			{
				System.out.println("No courses available for this cut-off");
			}
		}
		if(collegeCode==5904)
		{
			if(cutOff>=180 && cutOff<=190)
			{
				System.out.println("Available courses for your cut-off are ECE and CSE");
				System.out.println("On-Campus companies visited for ECE department at our college:");
				System.out.println("1.VTS\n 2.KCS\n 3.K&T\n 4.WAAR TECH");
				System.out.println("On-Campus companies visited for CSE department at our college:");
				System.out.println("1.VTS\n 2.KLENSYS\n 3.K&T\n 4.WAAR TECH");
			}
			else if(cutOff>=170 && cutOff<180)
			{
				System.out.println("Available course for your cut-off is IT and MCA ");
				System.out.println("On-Campus companies visited for IT department at our college:");
				System.out.println("1.VISCO\n 2.IBN\n 3.TOOGLE\n 4.MICRO TECHNOLOGIES");
				System.out.println("On-Campus companies visited for MCA DEPARTMENT at our college:");
				System.out.println("1.VTS\n 2.HCN\n 3.KLENSYS\n 4.CLOUDFORCE TECHNOLOGIES");
			}
			else 
			{
				System.out.println("No courses available for this cut-off");
			}
		}
		
	}
	}
		
		
	
	
	
