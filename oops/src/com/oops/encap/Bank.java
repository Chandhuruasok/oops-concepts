package com.oops.encap;

public class Bank {
	
	public void deposit(long accountNo,int depositAmnt)
	{
		System.out.println(" Amount deposited on your account number: "+accountNo+" is "+depositAmnt);
	}
	public void deposit(String userName,String IFSC,int depositAmnt)
	{
		System.out.println(" username: "+userName+" IFSC CODE: "+IFSC+depositAmnt);
	}
	public void deposit(String userName,long phoneNumber)
	{
		System.out.println(" user name: "+userName+" phone number: "+phoneNumber);
	}
	
	
}
