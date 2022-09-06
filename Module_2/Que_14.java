package Module_2;

class triangle 
{

	public void data(int a,int b,int c)
	{
		int s;
		s=a+b+c;
		System.out.println("parameter is :"+s);
	}
	public void result(int a,int b,int c)
	{
		int s;
		s=(a+b+c)/2;  
		double area;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		if((a+b)<c || (a+c)<b || (b+c)<a)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("area is :"+area);
		}
	}
	
}
public class Que_14 {
public static void main(String[] args) {
	triangle t1=new triangle();
	t1.data(7, 3, 9);
	t1.result(4, 6, 7);
			
}
}
