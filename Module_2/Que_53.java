package Module_2;

import java.awt.List;
import java.util.ArrayList;

public class Que_53 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add("welcome");
	a1.add("srushti");
	a1.add("maiyani");
	System.out.println(a1);
	java.util.List l=a1.subList(0, 3);
	System.out.println("first three list names  :"+l);
}
}
