package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Que_45 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("hello");
		a1.add("welcome");
		a1.add("srushti");
		a1.add("maiyani");
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		System.out.println(a2);
		
		Collections.copy(a1, a2);
		System.out.println("after copy : "+a1);
		System.out.println(a2);
	}
}
