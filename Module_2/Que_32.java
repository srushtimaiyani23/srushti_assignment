package Module_2;

class Demo extends Thread
{
	public void run()
	{
		int i=0;
		while(i<5)
		{
			System.out.println("running thread");
			i++;
		}
	}
}
public class Que_32 {
public static void main(String[] args) {
	Demo d1=new Demo();
	d1.run();
}
}
