package Module_2;

import java.util.Scanner;

class AgeNotWithinException extends Exception
{
	public AgeNotWithinException()
	{
		System.out.println("invalid");
	}
}
class Student
{
	int r_no,age;
	String name,course;
	
	public Student(int r_no,String name,int age,String course)
	{
		this.r_no=r_no;
		this.name=name;
		this.age=age;
		this.course=course;
	}
	public void check() throws AgeNotWithinException 
	{
		
		System.out.println("roll no is :"+r_no);
		System.out.println("name is :"+name);
		
		System.out.println("course is :"+course);
		
		if(!(age>15 && age<21))
		{
			throw new AgeNotWithinException();
		}
		else
		{
			System.out.println("age is :"+age);
		}
	}
}


public class Que_30 {
public static void main(String[] args) {
	int r_no,age;
	String name,course;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter roll_no :");
	r_no=sc.nextInt();
	System.out.println("enter name :");
	name=sc.next();
	System.out.println("enter age :");
	age=sc.nextInt();
	System.out.println("enter course name :");
	course=sc.next();
	
	Student s1=new Student(r_no,name,age,course);
	try {
		s1.check();
	} catch (AgeNotWithinException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

}
