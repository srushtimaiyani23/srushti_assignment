package Module_2;

import java.awt.List;

import java.util.HashSet;

public class Que_57 {
private static final int HashSet = 0;

public static void main(String[] args) {
	HashSet h1=new HashSet();
	h1.add("A");
	h1.add("B");
	h1.add("C");
	h1.add("D");
	System.out.println("Hashset is :"+h1);
	
	String[] array=new String[h1.size()];
	h1.toArray(array);
	for(String s:array)
	{
		System.out.println(s);
	}
}
}
