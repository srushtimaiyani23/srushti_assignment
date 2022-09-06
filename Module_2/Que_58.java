package Module_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Que_58 {
public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("A");
	h1.add("B");
	h1.add("C");
	h1.add("D");
	System.out.println("Hashset is :"+h1);
	
	ArrayList l=new ArrayList(h1);
	System.out.println("Arraylist is :"+l);
	
}
}
