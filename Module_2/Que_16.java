package Module_2;
class Parent3{
	public void message()
	{
		
	}
}

class subclass1 extends Parent3
{
	public void message()
	{
		System.out.println("this is first class");
	}

}
class subclass2 extends Parent3
{
	public void message()
	{
		System.out.println("this is second class");
	}
}
public class Que_16 {
public static void main(String[] args) {
	subclass1 s1=new subclass1();
	
	subclass2 s2=new subclass2();
	s1.message();
	s2.message();
}
}
