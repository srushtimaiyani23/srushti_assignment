package Module_2;

import java.util.Scanner;

public class Que_27 {
public static void main(String[] args) {
	try
	{
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("enter number :");
		n=sc.nextInt();
		if(n>=10 && n<=40)
		{
			System.out.println(n);
		}

	}
	catch(ArithmeticException e)
	{
	e.printStackTrace();
	}
}
}
