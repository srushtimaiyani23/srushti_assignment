package Module_2;

import java.util.ArrayList;

public class Que_40 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add(4);
	a1.add(3.89);
	a1.add(9.9);
	a1.add("welcome");
	a1.add(190);
	System.out.println("result :"+a1);
	
	Object ele=a1.get(2);
	Object ele1=a1.get(5);
	System.out.println(ele);
	System.out.println(ele1);
	
	
	
}
}
