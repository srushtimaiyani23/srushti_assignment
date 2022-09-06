package Module_2;

import java.util.HashMap;

public class Que_51 {
public static void main(String[] args) {
	HashMap h1=new HashMap();
	h1.put(4, 400);
	h1.put("hii", "chomu");
	h1.put(4.98, 3);
	h1.put("V", 'N');
	System.out.println(h1);
	System.out.println("size is : "+h1.size());
	System.out.println(h1.keySet());
	System.out.println(h1.values());
	System.out.println(h1.keySet().size());
	System.out.println(h1.values().size());
}
}
