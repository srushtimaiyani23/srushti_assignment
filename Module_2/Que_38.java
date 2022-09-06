package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Que_38 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add(4);
	a1.add(3.89);
	a1.add(9.9);
	a1.add("welcome");
	System.out.println("result :"+a1);
	
	Iterator i1=a1.iterator();
	{
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
			
}
}
