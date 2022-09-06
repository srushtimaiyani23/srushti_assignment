package Module_2;

import java.util.ArrayList;

public class Que_54 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add("welcome");
	a1.add("srushti");
	a1.add("maiyani");
	System.out.println(a1);

	
	ArrayList a2=new ArrayList();
	a2.add("hello");
	a2.add("welcome");
	a2.add("srushti");
	a2.add("maiyani");
	
//	a2.add("hii");
//	a2.add("bye");
//	a2.add("take");
//	a2.add("care");
	System.out.println(a2);
	
	
	if(a1.equals(a2)==true)
	{
		System.out.println("list are equal");
	}
	else
	{
		System.out.println("list are not equalS");
	}
}
}
