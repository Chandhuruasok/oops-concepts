package com.oops.encap;
import java.util.*;
public class TestBank {

	public static void main(String[] args) {
		ABCBank b=new ABCBank();
		Bank bank = new Bank();
		Scanner s=new Scanner(System.in);
		long accountNo,phoneNumber;
		int depositAmnt;
		String userName, IFSC;
		String userNameCheck="^[a-z]+$";
		System.out.println("Enter the user name:");
		userName=s.next();
		while(!userName.matches(userNameCheck))
		{
			System.out.println("Enter the username again:");
			userName=s.next();
		}
		
		System.out.println("Enter the account number:");
		accountNo=s.nextLong();
		if(accountNo<0 )
		{
			System.out.println("Enter the account number:");
			accountNo=s.nextLong();
		}
		System.out.println("Enter the phone number:");
		phoneNumber=s.nextLong();
		if(phoneNumber<0)
		{
			System.out.println("Enter the phone number:");
			phoneNumber=s.nextLong();
		}
		System.out.println("Enter the deposited amount:");
		depositAmnt=s.nextInt();
		if(depositAmnt<0)
		{
			System.out.println("Enter the deposited amount:");
			depositAmnt=s.nextInt();
		}
		String codeCheck="^[0-9A-Z]+$";
		System.out.println("Enter the IFSC code:");
		IFSC=s.next();
		while(!IFSC.matches(codeCheck))
		{
			System.out.println("Enter the IFSC code:");
			IFSC=s.next();
		}
		b.setUserName(userName);
		b.setAccountNo(accountNo);
		b.setDepositAmnt(depositAmnt);
		b.setIFSC(IFSC);
		b.setPhoneNumber(phoneNumber);
		/*System.out.println(b.getUserName());
		System.out.println(b.getAccountNo());
		System.out.println(b.getDepositAmnt());
		System.out.println(b.getIFSC());
	
		bank.deposit(b.getAccountNo(), b.getDepositAmnt());
		bank.deposit(b.getUserName(), b.getIFSC(), b.getDepositAmnt());
		bank.deposit(b.getUserName(), b.getPhoneNumber());
		
		/*b.deposit(accountNo,depositAmnt);
		b.deposit(userName, IFSC, depositAmnt);
		b.deposit(userName, phoneNumber);*/
		s.close();
		
	}

}
