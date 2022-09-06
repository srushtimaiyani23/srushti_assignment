package Module_2;

import java.util.ArrayList;

public class Que_42 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add(4);
	a1.add(3.89);
	a1.add(9.9);
	a1.add("welcome");
	System.out.println("list :"+a1);
	a1.remove(2);
	System.out.println("remove index :"+a1);
}
}
