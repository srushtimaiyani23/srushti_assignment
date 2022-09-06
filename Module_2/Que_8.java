package Module_2;

class Printnumber
{
	public void println(int a)
	{
		System.out.println("interger : "+a);
	}
	public void println(float a)
	{
		System.out.println("float : "+a);
	}
	public void println(double a)
	{
		System.out.println("double : "+a);
	}
	public void println(String a)
	{
		System.out.println("string : "+a);
	}
}
public class Que_8 {
public static void main(String[] args) {
	
	Printnumber p1=new Printnumber();
	p1.println(3);
	p1.println(5.8);
	p1.println(2);
	p1.println("srushti");
	
}
}
