package Module_2;

import java.util.ArrayList;

public class Que_41 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("hello");
		a1.add(3);
		a1.add(4.09);
		a1.add('A');
		a1.add(55.90);
		System.out.println("Before update list "+a1);
		a1.set(1, "srushti");
		System.out.println("After update list "+a1);
		
	}
	
}
