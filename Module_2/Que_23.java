package Module_2;

import java.util.Scanner;

public class Que_23 {
public static void main(String[] args) {
	try 
	{
	int p,q;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter p :");
	p=sc.nextInt();
	System.out.println("enter q :");
	q=sc.nextInt();
	int r=p/q;
	System.out.println("sum is :"+r);
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
}
