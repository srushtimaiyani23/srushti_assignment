package Module_2;

import java.util.Scanner;

public class Que_28 {
public static void main(String[] args) {
	try
	{
		int age=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age :");
		age=sc.nextInt();
		
		if(age<18)
		{
			throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

