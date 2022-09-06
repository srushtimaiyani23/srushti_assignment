package Module_2;

class DeamonThread extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("this thread is set daemon");
		}
		else
		{
			System.out.println("this thread is not set deamon");
		}
	}
}
public class Que_36 {
public static void main(String[] args) 
{
	DeamonThread d1=new DeamonThread();
	DeamonThread d2=new DeamonThread();
	
	d1.setDaemon(true);
	
	d1.start();
	d2.start();
}
}
