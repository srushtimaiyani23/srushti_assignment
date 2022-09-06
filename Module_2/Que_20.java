package Module_2;

class Shape
{
	int length,breadth;
	int area;
	int r;
	public void RectangleArea()
	{
		
	}
	public void SquareArea()
	{
		
	}
	public void CircleArea()
	{
		
	}
}
class Area1 extends Shape
{
	int length,breadth;
	int area;
	int r;
	public void RectangleArea()
	{
		System.out.println("Area of Rectangle is :"+(length*breadth));
	}
	public void SquareArea()
	{
		System.out.println("Area of Square is : "+(4*area));
	}
	public void CircleArea()
	{
		System.out.println("Radius of Circle is :"+(3.14*r*r));
	}
}
public class Que_20 {

	public static void main(String[] args) {
		Area1 s1=new Area1();
		s1.length=5;
		s1.breadth=8;
		s1.area=12;
		s1.r=3;
		s1.RectangleArea();
		s1.SquareArea();
		s1.CircleArea();
	}
}
