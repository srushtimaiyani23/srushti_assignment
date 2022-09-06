package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Que_55 {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("hello");
	a1.add(4);
	a1.add(3.89);
	a1.add(9);
	a1.add("welcome");
	System.out.println("before swapping : "+a1);
	Collections.swap(a1, 0 , 2);
	System.out.println("after swapping : "+a1);
}
}
