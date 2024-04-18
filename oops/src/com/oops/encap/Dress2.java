package com.oops.encap;

public class Dress2 extends Dress1{
	String[] dress= {"Chudi","Midi","pattiyala","T-Shirt","frok"};
	public void dress()
	{
		int i;
		for(i=0;i<dress.length;i++)
		{
			System.out.println(dress[i]);
		}
}
}
