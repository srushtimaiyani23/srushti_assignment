package Module_2;

class parent
{
	public void pmethod()
	{
		System.out.println("This is parent class");
	}
}
class child extends parent
{
	public void cmethod()
	{
		System.out.println("This is child class");
	}
}

public class Que_11 {

	public static void main(String[] args) {
		
		parent p1=new parent();
		child c1=new child();
        System.out.println("parent by parent :");
		p1.pmethod();
		System.out.println("child by child:");
		c1.cmethod();
		System.out.println("parent by child:");
		c1.pmethod();
		
		
		
		
	}
}
