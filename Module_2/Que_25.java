package Module_2;

public class Que_25 {
public static void main(String[] args) 
{
	
	try
	{
		int[] a=new int[30];
		try
		{
			int i=a[30]/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero not possible");
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index element does not exists");
	}
}
}
