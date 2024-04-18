package com.oops.encap;
import java.util.*;
import java.util.regex.*;
public class TestBus {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		BusTicket b=new BusTicket();
		System.out.println("Enter the customer name:");
		String name=s.next();
		String nameCheck="^[a-z]+$";
		Pattern p=Pattern.compile(nameCheck);
		Matcher m=p.matcher(name);
		
		while(true)
		{
			if(m.matches())
			{
				break;
			}
			else
			{
				System.out.println("Enter the customer name:");
				name=s.next();
				m=p.matcher(name);
				
			}
		}
		
		System.out.println("Enter the boarding point:");
		String boardpoint=s.next();
		Matcher m1=p.matcher(boardpoint);
		
		while(true)
		{
			if(m1.matches())
			{
				break;
			}
			else
			{
				System.out.println("Enter the boarding point:");
				boardpoint=s.next();
				m1=p.matcher(name);
				
			}
		}
		
		System.out.println("Enter the destination:");
		String destination=s.next();
		Matcher m3=p.matcher(destination);
		
		while(true)
		{
			if(m3.matches())
			{
				break;
			}
			else
			{
				System.out.println("Enter the destination:");
				destination=s.next();
				m3=p.matcher(name);
				
			}
		}
	
		
		
		System.out.println("Enter the pickup timing:");
		double pickup =s.nextDouble();
		while(pickup<0)
		{
			System.out.println("Enter the pickup timing again:");
		    pickup =s.nextDouble();
		}
		System.out.println("Enter the drop timing:");
		double drop =s.nextDouble();
		while(drop<0)
		{
			System.out.println("Enter the pickup timing again:");
		    drop =s.nextDouble();
		}
		
		b.setCustomerName(name);
		b.setBoardingPoint(boardpoint);
		b.setDestination(destination);
		b.setPickupTime(pickup);
		b.setDropTime(drop);
		//BusTicket b1=new BusTicket("chan","mdu","bangl",9.35,5.35);
		System.out.println("customer name:"+b.getCustomerName());
		System.out.println("boarding point:"+b.getBoardingPoint());
		System.out.println("destination:"+b.getDestination());
		System.out.println("pickup time:"+b.getPickupTime());
		System.out.println("drop time:"+b.getDropTime());
		//System.out.println(b1.toString());
		
	}

}
