package Module_2;

import java.util.Scanner;

class Grade
{
	
	public void Display()
	{
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mark :");
		a=sc.nextInt();
	if(a>90 && a<100)
	{
		System.out.println("Grade is A");
	}
	else if(a>80 && a<90)
	{
		System.out.println("Grade is B");
	}
	else if(a>70 && a<80)
	{
		System.out.println("Grade is C");
	}
	else if(a>60 && a<70)
	{
		System.out.println("Grade is D");
	}
	else if(a>50 && a<60)
	{
		System.out.println("Grade is E");
	}
	else if(a>40 && a<50)
	{
		System.out.println("Grade is F");
	}
	else
	{
		System.out.println("Fail");
	}
	}
}
public class Que_21 {
public static void main(String[] args) {
	
	
	Grade g1=new Grade();
	g1.Display();
	
}
}
