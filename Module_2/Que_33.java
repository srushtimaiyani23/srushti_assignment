package Module_2;

class sleeper extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
}


public class Que_33 {
public static void main(String[] args) 
	{
		sleeper s1=new sleeper();
		sleeper s2=new sleeper();
		s1.start();
		s2.start();
	
	}
}
