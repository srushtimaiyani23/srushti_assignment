package Module_2;

class Rectangle
{
	int length,breadth;
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public void area()
	{
		System.out.println(length*breadth);
	}
	public void perameter() {
		System.out.println(2*(length+breadth));
	}
}

class Square extends Rectangle
{
	public Square(int s)
	{
		super(s,s);
	}
}
public class Que_13 {
public static void main(String[] args) {
	Rectangle r1=new Rectangle(5,8);
	Square s1=new Square(7);
	System.out.println("rectangle area :");
	r1.area();
	System.out.println("rectangle perameter :");
	r1.perameter();
	System.out.println("triangle area :");
	s1.area();
	System.out.println("triangle parameter :");
	s1.perameter();
}
}
