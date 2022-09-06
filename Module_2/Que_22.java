package Module_2;

class Shape2
{
	public void print1()
	{
		System.out.println("this is shape");
	}
}
class Rectangle2 extends Shape2
{
	public void print()
	{
		System.out.println("this is rectangle");
	}
}
class Circle2 extends Shape2
{
	public void print()
	{
		System.out.println("this is circle");
	}
}
class Square2 extends Rectangle2
{
	public void show()
	{
		System.out.println("square is a rectangle");
	}
}
public class Que_22 {
public static void main(String[] args) {
	Square2 s1=new Square2();
    s1.print1();
    s1.print();
}
}
