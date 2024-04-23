package com.oops.encap;

public abstract class StudentExtend {
public int addTask(int mark)
{
	System.out.println("student mark out of 500 is:"+mark);
	return mark;
	
}
public String grade(String grade)
{
	System.out.println("Student grade is:"+grade);
	return grade;
}
public abstract void displayTask();
}
