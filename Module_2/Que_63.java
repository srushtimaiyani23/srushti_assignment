package Module_2;

import java.util.HashSet;

public class Que_63 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("A");
	h1.add("B");
	h1.add("C");
	h1.add("D");
	System.out.println("set 1 is :"+h1);
	
	HashSet h2=new HashSet();
	h2.add("1");
	h2.add("B");
	h2.add("C");
	h2.add("4");
	System.out.println("set 2 is :"+h2);
	
	h1.retainAll(h2);
	System.out.println("same set retain :"+h1);
}
}
