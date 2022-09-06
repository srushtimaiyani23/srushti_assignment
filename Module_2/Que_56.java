package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Que_56 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add("welcome");
	a1.add("srushti");
	a1.add("maiyani");
	System.out.println(a1);

	
	ArrayList a2=new ArrayList();
	a2.add("hii");
	a2.add("bye");
	a2.add("take");
	a2.add("care");
	System.out.println(a2);
	
	a1.addAll(a2);
	System.out.println(a1);
	
}
}
