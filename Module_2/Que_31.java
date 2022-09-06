package Module_2;

class show implements Runnable
{
	@Override
	public void run() {
		
		System.out.println("I am srushti");
		
	}

	public void data(String s) {
		// TODO Auto-generated method stub
		
	}
}

public class Que_31 {
public static void main(String[] args) {
	 
	show s1=new show();
	Thread t1=new Thread(s1);
	
	t1.start();
	}
}
