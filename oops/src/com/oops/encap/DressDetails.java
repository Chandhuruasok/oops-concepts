package com.oops.encap;

public class DressDetails extends Dress2{
	String[] dress= {"Pant","Shirt","Hoodi","T-Shirt","Cargo","Trouser"};
	public void dress()
	{
		int i;
		for(i=0;i<dress.length;i++)
		{
			System.out.println(dress[i]);
		}
		System.out.println("dresses available");		
	}

}
