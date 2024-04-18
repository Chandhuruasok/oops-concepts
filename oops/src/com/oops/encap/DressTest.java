package com.oops.encap;
import java.util.*;
public class DressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Dress d=new Dress();
		String dressCheck="^[a-zA-Z]+$";
		System.out.println("Enter the dress type:");
		d.dressType=s.next();
		while(!d.dressType.matches(dressCheck))
		{
			System.out.println("Enter the dress type again:");
			d.dressType=s.next();
		}
		System.out.println("Enter the dress colour:");
		d.colour=s.next();
		while(!d.colour.matches(dressCheck))
		{
			System.out.println("Enter the dress colour again:");
			d.colour=s.next();
		}
		
		System.out.println("Enter the size of the dress:");
		d.size=s.nextInt();
		if(d.size<0)
		{
			System.out.println("Enter the size of the dress again:");
			d.size=s.nextInt();
		}
		System.out.println("Enter the budget for dress:");
		d.budget=s.nextDouble();
		if(d.budget<0)
		{
			System.out.println("Enter the budget for  dress again:");
			d.budget=s.nextDouble();
		}
		d.setBudget(d.budget);
		d.setColour(d.colour);
		d.setDressType(d.dressType);
		d.setSize(d.size);
		System.out.println("Dress type:"+d.getDressType());
		System.out.println("Dress colour:"+d.getColour());
		System.out.println("Dress size is:"+d.getSize());
		System.out.println("Your budget is:"+d.getBudget());
		System.out.println("Dresses available for Gents");
		DressDetails dr=new DressDetails();
		dr.dress();
		System.out.println("-----------------------------------------------");
		System.out.println("Dresses available for Ladies");
		Dress2 dk=new Dress2();
		dk.dress();
		
	}

}
