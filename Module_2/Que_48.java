package Module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Que_48 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("A");
	h1.add("B");
	h1.add("C");
	h1.add("D");
	System.out.println("set is :"+h1);
	
	Iterator i1=h1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
}
}
