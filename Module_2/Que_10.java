package Module_2;

class area
{
	public void rec(int l,int b)
	{
		System.out.println("rectangle area is :"+l*b);
	}
	public void tri(int s)
	{
		System.out.println("square side of triangle is :"+s*s);
	}
}
public class Que_10 {
public static void main(String[] args) {
	area a1=new area();
	a1.rec(7, 4);
	a1.tri(6);
}
}
