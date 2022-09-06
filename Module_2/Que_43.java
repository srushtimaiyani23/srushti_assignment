package Module_2;

import java.util.ArrayList;

public class Que_43 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add(4);
	a1.add(3.89);
	a1.add(9.9);
	a1.add("welcome");
	System.out.println("result :"+a1);
	
	if(a1.contains("welco"))
	{
		System.out.println("search index");
	}
	else
	{
		System.out.println("can not search");
	}
	
}
}
