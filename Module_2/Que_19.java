package Module_2;

class Result
{
	public void Factorial()
	{
		int num=4,fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +num+ " is " +fact);
	}
}
public class Que_19 {
public static void main(String[] args) {
	Result r1=new Result();
	r1.Factorial();
}
	
}
