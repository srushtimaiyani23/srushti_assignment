package Module_2;


public class Que_24 {
public static void main(String[] args) {
	
	try {
	
	int[] a=new int[5];
	a[5]=30/0;
    }
	
	 catch(ArithmeticException ex)
		{
	    	
	    	System.out.println("zero can't divide");
		}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("index out of size array");
	}
  
   }
}
