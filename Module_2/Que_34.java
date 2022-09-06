package Module_2;

class ThreadTwice1 extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}
}
public class Que_34
{
public static void main(String[] args)
	{
	ThreadTwice1 t1=new ThreadTwice1();
	t1.start();
	t1.start();
	}
}
