package com.oops.encap;
import java.util.*;
public class TestStudent  {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		Student1 s1=new Student1();
		StudentDetails sd=new StudentDetails();
		String nameCheck="^[a-zA-Z]+$";
		System.out.println("Enter the student name:");
		st.studentName=s.next();
		while((!st.studentName.matches(nameCheck)))
		{
			System.out.println("Enter the student name:");
			st.studentName=s.next();
		}
		
		System.out.println("Enter the id:");
		st.id=s.nextInt();
		if(st.id<0)
		{

			System.out.println("Enter the id:");
			st.id=s.nextInt();
		}
		System.out.println("Enter the location of student:");
		st.location=s.next();
		while((!st.location.matches(nameCheck)))
		{
			System.out.println("Enter the location of student:");
			st.location=s.next();
		}
		
		System.out.println("Enter the degree:");
		st.degree=s.next();
		while((!st.location.matches(nameCheck)))
		{
			System.out.println("Enter the degree:");
			st.location=s.next();
		}
		
		st.setstudentName(st.studentName);
		st.setId(st.id);
		st.setDegree(st.degree);
		st.setLocation(st.location);
		sd.detailStudent(st.getstudentName(), st.getId());
		sd.detailStudent(st.getLocation(), st.getDegree());
		s1.displayTask();
		s1.write();
		s1.read();
		System.out.println("Enter the student mark out of 500:");
		int mark=s.nextInt();
		if(mark<0)
		{
			System.out.println("Enter the student mark out of 500:");
			mark=s.nextInt();
		}
		s1.addTask(mark);
		System.out.println("Enter the student grade:");
		String grade=s.next();
		while(!grade.matches(nameCheck))
		{
			System.out.println("Enter the student grade:");
		    grade=s.next();
		}
		s1.grade(grade);
	}

}
