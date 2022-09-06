package Module_2;

import java.util.Scanner;

public class Que_26 {
public static void main(String[] args) {
	
	try
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("enter first number :");
	a=sc.nextInt();
	System.out.println("enter second number :");
	b=sc.nextInt();
	int c=a/b;
	}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
}
