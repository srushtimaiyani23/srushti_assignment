package Module_2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Que_50 {
public static void main(String[] args) {
	HashMap p1=new HashMap();
	p1.put(1, 44);
	p1.put(2, "srushti");
	p1.put(3.22, 'S');
	System.out.println(p1);

	Set set=p1.entrySet();
	Iterator i1=set.iterator();
	while(i1.hasNext())
	{
		Map.Entry m=(Map.Entry)i1.next();
		System.out.println("key is :"+m.getKey());
		System.out.println("value is :"+m.getValue());

		
	}
}
}
