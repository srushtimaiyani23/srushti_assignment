package Module_2;

import java.util.HashMap;

public class Que_59 {
public static void main(String[] args) {
	HashMap p1=new HashMap();
	p1.put(1, 44);
	p1.put(2, "srushti");
	p1.put(3.22, 'S');
	System.out.println(p1);
	
	boolean r=p1.isEmpty();
	System.out.println(r);
	
	p1.clear();
	
	r=p1.isEmpty();
	System.out.println(r);
}
}
