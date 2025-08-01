package com.student;

import java.util.ArrayList;
import java.util.Scanner;

public class Managment
{
	 static Scanner sc=new Scanner(System.in);
	 static int choice;	 
	 static ArrayList<student> std=new ArrayList<student>();
	
	 static  void addstudent()
	 {
		  System.out.println("Enter Student rollno");
		    int rollno = sc.nextInt();

		    System.out.println("Enter student Name");
		    String name = sc.next();

		    System.out.println("Enter Your Course");
		    String course = sc.next();

		    student s = new student(rollno, name, course);
		    std.add(s);
		    StudentDAO.insertStudent(s);  

		    System.out.println("Student added successfully to ArrayList and Database.");
			
	 }
	 static void View_Student()
	 {
		 if(std.isEmpty())
			{
				System.out.println("Add Some Students");
			}
			else
			{
				for(student s:std)
				{
					System.out.println(s);
					
				}
	    }
	 }
	static void SearchStudent()
	 {
		  System.out.println("Enter Roll Number to search student");
		  int rollno=sc.nextInt();
		  boolean found = false;
		for(student value:std)
		{
			if(value.rollno==rollno)
			{
			   System.out.println(value);
			  found=true;
			   break;
			}
		}
			if(!found)
			{
				System.out.println("Please Enter Valid Roll no");
				
			}
		}
	 
	 static void updatestudent()
	 {
		    System.out.println("Enter Roll Number to Update student");
		    int rollno=sc.nextInt();
		    boolean found = false;
		    for(student value:std)
		  {
			if(value.rollno==rollno)
			{
			   value.getName();
			   System.out.println("Enter New Name");
			   String name=sc.next();
			   value.setName(name);
			   value.getCourse();
			   System.out.println("Enter New Course");
			   String course=sc.next();
			   value.setCourse(course);
			   found=true;
			   break;
			}
		
			
		}
			if(!found)
			{
				System.out.println("Please Enter Valid Roll no");
				
			}
	 }
	 static void DeleteStudent()
	 {
		 System.out.println("Enter roll no to delete");
		 int rollno=sc.nextInt();
		 boolean remove = false;
		 for(student value:std)
		 {
			 if(value.rollno==rollno)
			 {
				 std.remove(value);
				  System.out.println("Student deleted successfully.");
	                remove = true;
	                break;
			 }
		 }
		 if(!remove)
		 {
			 System.out.println("Student not found.");
		 }
	 }
	 static void exit()
	 {
		 System.out.println("THANK-YOU!!!!!");
	 }
	public static void main(String[] args) 
	{
		
			do {
				System.out.println("Wel-come to Student Managment System");
				System.out.println("------------------------------------");
				System.out.println("1.Add Student");
				System.out.println("2.View Student");
				System.out.println("3.Search Student");
				System.out.println("4.Update Student");
				System.out.println("5.Delete Student");
				System.out.println("6.Exit");
				System.out.println("Enter Your Coise");
				choice=sc.nextInt();
		switch(choice)
		{
		case 1:
				addstudent();
			    break;
			
		case 2:
			   View_Student();
				break;
		case 3:
			  SearchStudent();
			  break;
		case 4:
			 updatestudent();
			 break;
		case 5:
			DeleteStudent();
			 break;
		case 6:
			exit();
			break;
			
		
		default:System.out.println("Invalid coise");
		}
			}while(choice!=3);
	}

}
