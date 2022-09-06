package Module_2;

import java.util.ArrayList;

public class Que_62 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add("welcome");
	a1.add("srushti");
	a1.add("maiyani");
	System.out.println(a1);
	
	int i=a1.size();
	for(int j=0;j<i;j++)
	{
		System.out.println("print all index position");
		System.out.println(a1.get(j));
	}
//	String s=(String) a1.get(0);
//	System.out.println("first element :"+s);
//	s=(String) a1.get(2);
//	System.out.println("third element :"+s);
}
}
