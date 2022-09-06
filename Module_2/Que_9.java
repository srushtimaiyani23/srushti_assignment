package Module_2;

class print{
	public void output(int n,char c)
	{
		System.out.println("integer :"+n);
		System.out.println("character :"+c);
	}
	public void output(char c,int n)
	{
		System.out.println("character :"+c);
		System.out.println("integer :"+n);
	}
}
public class Que_9 {
public static void main(String[] args) {
	print p1=new print();
	p1.output(3,'a');
	System.out.println("======");
	p1.output('a', 3);
}
}
